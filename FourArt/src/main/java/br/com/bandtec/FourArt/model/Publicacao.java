package br.com.bandtec.FourArt.model;

import java.time.LocalDateTime;

public class Publicacao {

	private int idPublicacao;

	private String titulo;

	private String desc;

	private int notaAvaliacao;

	private String comentarios;

	private LocalDateTime dhInclu;

	public Publicacao(int idPublicacao, String titulo, String desc, int notaAvaliacao, String comentarios, LocalDateTime dhInclu) {
		this.idPublicacao = idPublicacao;
		this.titulo = titulo;
		this.desc = desc;
		this.notaAvaliacao = notaAvaliacao;
		this.comentarios = comentarios;
		this.dhInclu = dhInclu;
	}

	public int getIdPublicacao() {
		return idPublicacao;
	}

	public void setIdPublicacao(int idPublicacao) {
		this.idPublicacao = idPublicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getNotaAvaliacao() {
		return notaAvaliacao;
	}

	public void setNotaAvaliacao(int notaAvaliacao) {
		this.notaAvaliacao = notaAvaliacao;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public LocalDateTime getDhInclu() {
		return dhInclu;
	}

	public void setDhInclu(LocalDateTime dhInclu) {
		this.dhInclu = dhInclu;
	}

	@Override
	public String toString() {
		return "Publicacao{" +
				"idPublicacao=" + idPublicacao +
				", titulo='" + titulo + '\'' +
				", desc='" + desc + '\'' +
				", notaAvaliacao=" + notaAvaliacao +
				", comentarios='" + comentarios + '\'' +
				", dhInclu=" + dhInclu +
				'}';
	}
}
