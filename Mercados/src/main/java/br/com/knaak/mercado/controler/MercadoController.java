package br.com.knaak.mercado.controler;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.knaak.mercado.modelo.Mercado;
import br.com.knaak.mercado.servico.MercadosService;


@Controller
@RequestMapping("/mercado")
public class MercadoController {
	
	@Autowired
	private MercadosService servico;
	
	@GetMapping("/cadastro")
	public String cadastro(Mercado mercado, Model model) {
		if (mercado == null) {
			mercado = new Mercado();

		}
		model.addAttribute("mercado", mercado);

		return "mercado/cadastro";
	}

	@PostMapping("/salvar")
	public String salvar(@Valid @ModelAttribute("mercado") Mercado mercado, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			return cadastro(mercado, model);
		}
		servico.salvar(mercado);

		return "redirect:/mercado";
	}

	@GetMapping
	public String mercados(Model model) {

		model.addAttribute("mercados", servico.mercados());

		return "mercado/mercados";
	}

	@PostMapping("/pesquisar")
	public String pesquisar(String pesquisa, Model model) {
		model.addAttribute("mercados", servico.consultar(pesquisa));
		return "mercado/mercados";
	}

	@GetMapping("/{id}")
	public String mercados(@PathVariable Long id, Model model) {
		model.addAttribute("mercados", servico.mercados(id));
		return "mercado/detail";
	}

	@GetMapping("/{id}/excluir")
	public String excluir(@PathVariable Long id) {
		servico.deletar(id);
		return "redirect:/mercado";
	}

	@GetMapping("/{id}/editar")
	public String editar(@PathVariable Long id, Model model) {

		model.addAttribute("mercados", servico.mercados(id));
		return "mercado/cadastro";
	}


}
