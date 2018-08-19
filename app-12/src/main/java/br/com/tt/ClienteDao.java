<<<<<<< HEAD
package br.com.tt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ClienteDao implements Dao<Cliente> {

	private static List<Cliente> clientes = new ArrayList<>();
	private static Long id = 0L;

	@Override
	public void salvar(Cliente cliente) {
		if (cliente.getId() == null) {
			cliente.setId(++id);
		}
		if (buscar(cliente) == null) {
			clientes.add(cliente);
		}
	}

	@Override
	public void alterar(Cliente cliente) {
		salvar(cliente);

	}

	@Override
	public Cliente buscar(Long id) {

		return clientes.stream().filter(cliente -> cliente.getId().equals(id)).findFirst().get();
	}

	@Override
	public Cliente buscar(Cliente cliente) {
		// return clientes.stream().filter((Predicate<? super Cliente>)
		// cliente).findFirst().orElse(null);
		return clientes.stream().filter(cliente).findFirst().orElse(null);
	}

	@Override
	public void deletar(Long id) {
		clientes.remove(buscar(id));

	}

	@Override
	public void deletar(Cliente cliente) {
		clientes.remove(cliente);

	}

	public void clear() {
		clientes.clear();
		id = 0L;
	}

	@Override
	public List<Cliente> consultar() {
		return clientes;

	}

	@Override
	public List<Cliente> consultar(Cliente cliente) {
		// TODO Auto-generated method stub
		// return clientes.stream().filter((Predicate<? super Cliente>)
		// cliente).collect(Collectors.toList());
		return clientes.stream().filter(cliente).collect(Collectors.toList());
	}

	@Override
	public List<Cliente> consultar(List<Cliente> clientes) {
		Set<Cliente> prods = new HashSet<Cliente>();
		for (Cliente clientes2 : clientes) {
			prods.addAll(consultar(clientes2));
		}
		// produtos.forEach(produto ->prods.addAll(consultar(produto)));
		return new ArrayList<>(prods);
	}

}
=======
package br.com.tt;

import java.util.List;

public class ClienteDao implements Dao<Cliente> {

	@Override
	public void salvar(Cliente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Cliente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente buscar(Cliente t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(Cliente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> consultar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> consultar(Cliente t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> consultar(List<Cliente> t) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
>>>>>>> bcdf0a8df3c24286f7e9e678ab3165c6b41764d3
