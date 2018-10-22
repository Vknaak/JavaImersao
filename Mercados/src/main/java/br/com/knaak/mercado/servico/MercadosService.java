package br.com.knaak.mercado.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.knaak.mercado.modelo.Mercado;
import br.com.knaak.mercado.repositorio.MercadoRepository;



@Service
public class MercadosService {	
	@Autowired
	private MercadoRepository repo;
	
	public List<Mercado> mercados(){
		return repo.findAll();
	}
	public Mercado salvar(Mercado mercados) {
		return repo.save(mercados);
	}

	public Mercado mercados(Long id) {
		return repo.findById(id).orElse(null);
	}

	public void deletar(Long id) {
		repo.deleteById(id);
	}

	public List<Mercado> consultar(String busca) {
		busca = "%" + busca + "%";
		return repo.findByRazaoLikeIgnoreCaseOrCnpjLikeIgnoreCase(busca, busca);
	}


}
