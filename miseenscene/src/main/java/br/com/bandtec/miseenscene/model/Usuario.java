package br.com.bandtec.miseenscene.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.sql.Date;

@Entity
@Table(name = "USUARIO")
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
	@Column(unique = true, name = "EMAIL")
	private String email;

	@NotEmpty
	@Column(name = "LOGIN")
	private String login;

	@NotEmpty
	@Column(name = "SENHA")
	private String senha;

	@Column(name = "NACIONALIDADE")
	private String nacionalidade;

	@Column(name = "DATANASC")
	private Date dataNasc;

	public Usuario() {
	}

	public Usuario(@NotEmpty String email, @NotEmpty String login, @NotEmpty String senha, String nacionalidade, Date dataNasc) {
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.nacionalidade = nacionalidade;
		this.dataNasc = dataNasc;
	}

	public Usuario(@NotEmpty Long idUsuario, @NotEmpty String email, @NotEmpty String login, @NotEmpty String senha, String nacionalidade, Date dataNasc) {
		this.idUsuario = idUsuario;
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.nacionalidade = nacionalidade;
		this.dataNasc = dataNasc;
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

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Date getDataNasc() {
		return dataNasc;
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
				", email='" + email + '\'' +
				", login='" + login + '\'' +
				", senha='" + senha + '\'' +
				", nacionalidade='" + nacionalidade + '\'' +
				", dataNasc=" + dataNasc +
				'}';
	}
}
