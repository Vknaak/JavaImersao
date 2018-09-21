package br.com.tt.vo;

public class CidadeVO {
	
	private String Cidade;
	private String Estado;
	
	public CidadeVO(String cidade, String estado) {
		super();
		Cidade = cidade;
		Estado = estado;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	@Override
	public String toString() {
		return "CidadeVO [Cidade=" + Cidade + ", Estado=" + Estado + "]";
	}
	
	

}
