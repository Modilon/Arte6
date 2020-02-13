package br.com.bandtec.FourArt.model;

public class Portfolio {

	private int idPortfolio;

	private String nome;

	private String desc;

	private String status;

	private float valor;

	public Portfolio(int idPortfolio, String nome, String desc, String status, float valor) {
		this.idPortfolio = idPortfolio;
		this.nome = nome;
		this.desc = desc;
		this.status = status;
		this.valor = valor;
	}

	public int getIdPortfolio() {
		return idPortfolio;
	}

	public void setIdPortfolio(int idPortfolio) {
		this.idPortfolio = idPortfolio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Portfolio{" +
				"idPortfolio=" + idPortfolio +
				", nome='" + nome + '\'' +
				", desc='" + desc + '\'' +
				", status='" + status + '\'' +
				", valor=" + valor +
				'}';
	}
}
