package br.com.bandtec.FourArt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Usuario {

	@Id
	private Long idUsuario;

	@NotEmpty
	private String email;

	@NotEmpty
	private String nome;

	@NotEmpty
	private String senha;

	public Usuario() {
	}

	public Usuario(@NotEmpty Long idUsuario, @NotEmpty String email, @NotEmpty String nome, @NotEmpty String senha) {
		this.idUsuario = idUsuario;
		this.email = email;
		this.nome = nome;
		this.senha = senha;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Usuario usuario = (Usuario) o;

		return idUsuario.equals(usuario.idUsuario) && nome.equals(usuario.nome);
	}

	@Override
	public String toString() {
		return "Usuario{" +
				"idUsuario=" + idUsuario +
				", Email='" + this.email + '\'' +
				", Nome='" + this.nome + '\'' +
				", Senha='" + this.senha + '\'' +
				'}';
	}
}
