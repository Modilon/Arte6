package br.com.bandtec.miseenscene.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(
			name = "usuario_generator",
			sequenceName = "usuario_sequence",
			initialValue = 1
	)
	private Long idUsuario;

	@NotEmpty
	private String email;

	@NotEmpty
	private String login;

	@NotEmpty
	private String senha;

	public Usuario() {
	}

	public Usuario(@NotEmpty String email, @NotEmpty String login, @NotEmpty String senha) {
		this.email = email;
		this.login = login;
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

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
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

		return idUsuario.equals(usuario.idUsuario) && login.equals(usuario.login);
	}

	@Override
	public String toString() {
		return "Usuario{" +
				"idUsuario=" + idUsuario +
				", Email='" + this.email + '\'' +
				", Login='" + this.login + '\'' +
				", Senha='" + this.senha + '\'' +
				'}';
	}
}
