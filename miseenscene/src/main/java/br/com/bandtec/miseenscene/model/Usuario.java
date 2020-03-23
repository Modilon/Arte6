package br.com.bandtec.miseenscene.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

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

	@Column(name = "DESCRICAO")
	private String descricao;

	@Column(name = "DATANASC")
	private Date dataNasc;

	@Column(name = "DATAREGUSER")
	private Date dataRegUser;

	@OneToMany(mappedBy = "usuario", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<HabilidadeUsuario> habilidadeUsuarios = new HashSet<>();

	public Usuario() {
	}

	public Usuario(@NotEmpty String email, @NotEmpty String login, @NotEmpty String senha, String nacionalidade, String descricao, Date dataNasc, Date dataRegUser) {
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.nacionalidade = nacionalidade;
		this.descricao = descricao;
		this.dataNasc = dataNasc;
		this.dataRegUser = dataRegUser;
	}

	public Usuario(@NotEmpty Long idUsuario, @NotEmpty String email, @NotEmpty String login, @NotEmpty String senha, String nacionalidade, String descricao, Date dataNasc, Date dataRegUser) {
		this.idUsuario = idUsuario;
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.nacionalidade = nacionalidade;
		this.descricao = descricao;
		this.dataNasc = dataNasc;
		this.dataRegUser = dataRegUser;
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

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public void setDataRegUser(Date dataRegUser) {
		this.dataRegUser = dataRegUser;
	}

	public Date getDataRegUser() {
		return dataRegUser;
	}

	public Set<HabilidadeUsuario> getHabilidadeUsuarios() {
		return habilidadeUsuarios;
	}

	public void setHabilidadeUsuarios(Set<HabilidadeUsuario> habilidadeUsuarios) {
		this.habilidadeUsuarios = habilidadeUsuarios;
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
				", descricao='" + descricao + '\'' +
				", dataNasc=" + dataNasc +
				", dataRegUser=" + dataRegUser +
				'}';
	}
}
