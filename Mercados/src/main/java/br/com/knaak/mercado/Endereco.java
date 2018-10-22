package br.com.knaak.mercado;

public class Endereco {
	
	private String cep;

    private String logradouro;

    private String complemento;

    private String bairro;

    private String localidade;

    private String uf;

    private String unidade;

    private String ibge;

    private String gia;

    public void setCep(String cep){
        this.cep = cep;
    }
    public String getCep(){
        return this.cep;
    }
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    public String getLogradouro(){
        return this.logradouro;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    public String getComplemento(){
        return this.complemento;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public String getBairro(){
        return this.bairro;
    }
    public void setLocalidade(String localidade){
        this.localidade = localidade;
    }
    public String getLocalidade(){
        return this.localidade;
    }
    public void setUf(String uf){
        this.uf = uf;
    }
    public String getUf(){
        return this.uf;
    }
    public void setUnidade(String unidade){
        this.unidade = unidade;
    }
    public String getUnidade(){
        return this.unidade;
    }
    public void setIbge(String ibge){
        this.ibge = ibge;
    }
    public String getIbge(){
        return this.ibge;
    }
    public void setGia(String gia){
        this.gia = gia;
    }
    public String getGia(){
        return this.gia;
    }
	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", complemento=" + complemento + ", bairro="
				+ bairro + ", localidade=" + localidade + ", uf=" + uf + ", unidade=" + unidade + ", ibge=" + ibge
				+ ", gia=" + gia + "]";
	}
    
}

