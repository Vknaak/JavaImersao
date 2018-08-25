package br.com.tt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tt.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	

}
