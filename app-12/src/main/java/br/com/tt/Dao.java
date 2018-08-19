<<<<<<< HEAD
package br.com.tt;

import java.util.List;

public interface Dao<T> {

	// public abstract void salvar - esta incluso no metodo automaticamente
	void salvar(T t);
	void alterar(T t);

	T buscar(Long id);
	T buscar(T t);

	void deletar(Long id);
	void deletar(T t);
	
	List<T> consultar();
	List<T> consultar(T t);
	List<T> consultar(List<T> t);
	
	

}
=======
package br.com.tt;

import java.util.List;

public interface Dao<T> {

	// public abstract void salvar - esta incluso no metodo automaticamente
	void salvar(T t);
	void alterar(T t);

	T buscar(Long id);
	T buscar(T t);

	void deletar(Long id);
	void deletar(T t);
	
	List<T> consultar();
	List<T> consultar(T t);
	List<T> consultar(List<T> t);
	
	

}
>>>>>>> bcdf0a8df3c24286f7e9e678ab3165c6b41764d3
