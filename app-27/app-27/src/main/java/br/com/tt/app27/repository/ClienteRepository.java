package br.com.tt.app27.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tt.app27.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
		
		
}
