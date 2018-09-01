package br.com.tt;

public enum SexoType {
	M("masculino"), F("feminino");
	
	private String sexo;
	
	SexoType(String sexo){
		this.sexo =sexo;
	}

	public String getSexo() {
		return sexo;
	}

//	public void setSexo(String sexo) {
//		this.sexo = sexo;
	//}
	
}
