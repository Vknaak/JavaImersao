package br.com.knaak.mercado.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.knaak.mercado.Produto;
import br.com.knaak.mercado.modelo.Mercado;

public interface MercadoRepository extends JpaRepository<Mercado, Long> {
	
	List<Mercado>findByRazaoLikeIgnoreCaseOrCnpjLikeIgnoreCase(String razao, String cnpj);
	
	
	
}
