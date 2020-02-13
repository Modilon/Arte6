package br.com.bandtec.FourArt.model;

public class Categoria {

	private int idCategoria;

	private String nome;

	public Categoria(int idCategoria, String nome) {
		this.idCategoria = idCategoria;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	@Override
	public String toString() {
		return "Categoria{" +
				"idCategoria=" + idCategoria +
				", nome='" + nome + '\'' +
				'}';
	}
}
