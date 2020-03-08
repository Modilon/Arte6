package br.com.bandtec.miseenscene.model;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "PORTFOLIO")
public class Portfolio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(
			name = "portfolio_generator",
			sequenceName = "portfolio_sequence",
			initialValue = 1
	)
	private int idPortfolio;

	@NotEmpty
	@Column(name = "NOME")
	private String nome;

	@NotEmpty
	@Column(name = "DESC")
	private String desc;

	@NotEmpty
	@Column(name = "STATUS")
	private String status;

	@NotEmpty
	@Column(name = "VALOR")
	private float valor;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ID_USUARIO", nullable = false, foreignKey = @ForeignKey(name = "ID_USUARIO"))
	@JsonIgnore
	private Usuario usuario;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ID_PUBLI", nullable = false, foreignKey = @ForeignKey(name = "ID_PUBLI"))
	@JsonIgnore
	private Publicacao publicacao;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ID_CAT", nullable = false, foreignKey = @ForeignKey(name = "ID_CAT"))
	@JsonIgnore
	private Categoria categoria;

	public Portfolio() {
	}

	public Portfolio(@NotEmpty String nome, @NotEmpty String desc, @NotEmpty String status, @NotEmpty float valor) {
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
