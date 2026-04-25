package br.com.loja;

public class Entrega {

	private double frete;

	private double cep;
	private String endereco;
	private String primeiroNome;
	private String segundoNome;

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getCep() {
		return cep;
	}

	public void setCep(double cep) {
		this.cep = cep;
	}

	public double getFrete() {
		return frete = frete - frete + 10.0;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}

}
