package br.com.tt.app.type;

public enum TelefoneType {
	
	CELULAR("Celular"),
	RESIDENCIAL("Residencail"),
	COMERCIAL("Comercial"),
	FAX("Fax");
	
	private String label;

	private TelefoneType(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}

}
