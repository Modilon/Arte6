package br.com.bandtec.miseenscene.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "CATEGORIA")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(
			name = "categoria_generator",
			sequenceName = "categoria_sequence",
			initialValue = 1
	)
	@Column(name = "ID_CAT")
	private Long idCategoria;

	@NotEmpty
	@Column(name = "NOME_CAT")
	private String nome;

	public Categoria() {}

	public Categoria(@NotEmpty String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdCategoria(Long idCategoria) {
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
