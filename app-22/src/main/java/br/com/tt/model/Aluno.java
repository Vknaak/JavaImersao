<<<<<<< HEAD
package br.com.tt.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue(value = "CLASSE_ALUNO")
public class Aluno extends Pessoa {

	private String matricula;
	private String empresa;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
}
=======
package br.com.tt.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue(value = "CLASSE_ALUNO")
public class Aluno extends Pessoa {

	private String matricula;
	private String empresa;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
}
>>>>>>> e795a6125dd326b0e2b0c594c51b5b1e0baab156
