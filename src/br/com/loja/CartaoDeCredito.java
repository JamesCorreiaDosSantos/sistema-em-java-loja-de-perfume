package br.com.loja;

public class CartaoDeCredito {
	
	private String nomeImpresso;
	private String mesAno;
	private int codigoDeSeguranca;
	private String cpfDonoDoCartao;
	private long numero;
	private String Bandeira;
	
	
	
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getBandeira() {
		return Bandeira;
	}
	public void setBandeira(String bandeira) {
		Bandeira = bandeira;
	}
	public String getCpfDonoDoCartao() {
		return cpfDonoDoCartao;
	}
	public void setCpfDonoDoCartao(String cpfDonoDoCartao) {
		this.cpfDonoDoCartao = cpfDonoDoCartao;
	}
	public String getNomeImpresso() {
		return nomeImpresso;
	}
	public void setNomeImpresso(String nomeImpresso) {
		this.nomeImpresso = nomeImpresso;
	}
	public String getMesAno() {
		return mesAno;
	}
	public void setMesAno(String mesAno) {
		this.mesAno = mesAno;
	}
	public int getCodigoDeSeguranca() {
		return codigoDeSeguranca;
	}
	public void setCodigoDeSeguranca(int codigoDeSeguranca) {
		this.codigoDeSeguranca = codigoDeSeguranca;
	}
	

}
