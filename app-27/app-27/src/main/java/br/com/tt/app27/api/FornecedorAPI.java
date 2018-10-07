package br.com.tt.app27.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.tt.app27.model.Fornecedor;
import br.com.tt.app27.repository.FornecedorRepository;
import br.com.tt.app27.service.FornecedorService;

@RestController
@RequestMapping("/api/fornecedor")
public class FornecedorAPI {

	@Autowired
	private FornecedorService service;

	@GetMapping
	public ResponseEntity<List<Fornecedor>> fornecedores() {

		List<Fornecedor> fornecedores = service.fornecedores();
		if (fornecedores != null && !fornecedores.isEmpty()) {
			return new ResponseEntity<List<Fornecedor>>(fornecedores, HttpStatus.OK);
		}
		return new ResponseEntity<List<Fornecedor>>(fornecedores, HttpStatus.NO_CONTENT);
	}

	@RequestMapping(method = { RequestMethod.PUT, RequestMethod.POST, RequestMethod.PATCH })
	public ResponseEntity<?> salvar(@RequestBody Fornecedor fornecedor) {
		fornecedor = service.salvar(fornecedor);
		return new ResponseEntity<Fornecedor>(fornecedor, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletar(@PathVariable Long id) {
		service.deletar(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> buscar(@PathVariable Long id) {
		
		Fornecedor fornecedor = service.fornecedor(id);
		if(fornecedor != null) {
			return new ResponseEntity<Fornecedor>(fornecedor, HttpStatus.OK);			
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@GetMapping("/pesquisar")
	public ResponseEntity<List<Fornecedor>> pesquisar(@RequestParam String busca) {
		
		List<Fornecedor> fornecedores = service.consultar(busca);
		if(fornecedores != null && !fornecedores.isEmpty()) {
			return new ResponseEntity<List<Fornecedor>>(fornecedores, HttpStatus.OK);
		}
		return new ResponseEntity<List<Fornecedor>>(HttpStatus.NO_CONTENT);
	}

}
