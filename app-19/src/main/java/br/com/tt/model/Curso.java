package br.com.tt.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_CURSO")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer duracao;
	private String descricao;
	private String nome;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "TB_CURSO_ALUNO",
							joinColumns = {
									@JoinColumn(name ="CURSO_ID")},
							inverseJoinColumns = {
									@JoinColumn(name = "ALUNO_ID")})
	private List<Aluno> alunos;

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addAluno(Aluno aluno) {
		if (alunos == null) {
			alunos = new ArrayList<Aluno>();
		}
		alunos.add(aluno);
		aluno.addCurso(this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
