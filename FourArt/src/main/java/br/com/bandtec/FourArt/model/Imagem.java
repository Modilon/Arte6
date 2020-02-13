package br.com.bandtec.FourArt.model;

public class Imagem {

	private int idImagem;

	private String Nome;

	private String desc;

	public Imagem(int idImagem, String nome, String desc) {
		this.idImagem = idImagem;
		Nome = nome;
		this.desc = desc;
	}

	public int getIdImagem() {
		return idImagem;
	}

	public void setIdImagem(int idImagem) {
		this.idImagem = idImagem;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Imagem{" +
				"idImagem=" + idImagem +
				", Nome='" + Nome + '\'' +
				", desc='" + desc + '\'' +
				'}';
	}
}
