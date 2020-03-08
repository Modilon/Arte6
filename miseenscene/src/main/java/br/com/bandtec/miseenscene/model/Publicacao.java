package br.com.bandtec.miseenscene.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Entity
@Table(name = "PUBLICACAO")
public class Publicacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(
			name = "publicacao_generator",
			sequenceName = "publicacao_sequence",
			initialValue = 1
	)
	private int idPublicacao;

	@NotEmpty
	@Column(name = "TITULO")
	private String titulo;

	@NotEmpty
	@Column(name = "DESC")
	private String desc;

	@Column(name = "NOTAAVALIACAO")
	private int notaAvaliacao;

	@Column(name = "COMENTARIOS")
	private String comentarios;

	@NotEmpty
	@Column(name = "DHINCLU")
	private LocalDateTime dhInclu;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ID_USUARIO", nullable = false, foreignKey = @ForeignKey(name = "ID_USUARIO"))
	@JsonIgnore
	private Usuario usuario;

	public Publicacao() {
	}

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
