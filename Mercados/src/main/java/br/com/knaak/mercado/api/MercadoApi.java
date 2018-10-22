package br.com.knaak.mercado.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.knaak.mercado.modelo.Mercado;
import br.com.knaak.mercado.servico.MercadosService;



@RestController
@RequestMapping("/api/mercado")
public class MercadoApi {
	
	@Autowired
	private MercadosService service;
	
	@GetMapping
	public ResponseEntity<List<Mercado>> mercados() {

		List<Mercado> mercado = service.mercados();
		if (mercado != null && !mercado.isEmpty()) {
			return new ResponseEntity<List<Mercado>>(mercado, HttpStatus.OK);
		}
		return new ResponseEntity<List<Mercado>>(mercado, HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method = { RequestMethod.PUT, RequestMethod.POST, RequestMethod.PATCH })
	public ResponseEntity<?> salvar(@RequestBody Mercado mercado) {
		mercado = service.salvar(mercado);
		return new ResponseEntity<Mercado>(mercado, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletar(@PathVariable Long id) {
		service.deletar(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> buscar(@PathVariable Long id) {
		
		Mercado mercado = service.mercados(id);
		if(mercado != null) {
			return new ResponseEntity<Mercado>(mercado, HttpStatus.OK);			
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@GetMapping("/pesquisar")
	public ResponseEntity<List<Mercado>> pesquisar(@RequestParam String busca) {
		
		List<Mercado> mercado = service.consultar(busca);
		if(mercado != null && !mercado.isEmpty()) {
			return new ResponseEntity<List<Mercado>>(mercado, HttpStatus.OK);
		}
		return new ResponseEntity<List<Mercado>>(HttpStatus.NO_CONTENT);
	}

}
