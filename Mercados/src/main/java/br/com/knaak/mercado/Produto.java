package br.com.knaak.mercado;

public class Produto {
	private String fornecedor;

    private String endereco;

    private String telefone;

    private String departamentoProduto;

    private String produto;

    private String preco;

    private String codigoPromocional;

    public void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    }
    public String getFornecedor(){
        return this.fornecedor;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setDepartamentoProduto(String departamentoProduto){
        this.departamentoProduto = departamentoProduto;
    }
    public String getDepartamentoProduto(){
        return this.departamentoProduto;
    }
    public void setProduto(String produto){
        this.produto = produto;
    }
    public String getProduto(){
        return this.produto;
    }
    public void setPreco(String preco){
        this.preco = preco;
    }
    public String getPreco(){
        return this.preco;
    }
    public void setCodigoPromocional(String codigoPromocional){
        this.codigoPromocional = codigoPromocional;
    }
    public String getCodigoPromocional(){
        return this.codigoPromocional;
    }
	@Override
	public String toString() {
		return "Produto [fornecedor=" + fornecedor + ", endereco=" + endereco + ", telefone=" + telefone
				+ ", departamentoProduto=" + departamentoProduto + ", produto=" + produto + ", preco=" + preco
				+ ", codigoPromocional=" + codigoPromocional + "]";
	}
    

}
