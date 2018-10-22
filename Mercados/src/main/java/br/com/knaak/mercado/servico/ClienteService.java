package br.com.knaak.mercado.servico;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.knaak.mercado.Cliente;
import br.com.knaak.mercado.api.ClienteApi;

@Service
public class ClienteService {
	
	public List<Cliente> clientes() {

		return new ClienteApi().consulta();

	}

}
