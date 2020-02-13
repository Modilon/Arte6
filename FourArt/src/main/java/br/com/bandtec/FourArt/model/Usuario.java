package br.com.bandtec.FourArt.model;

public class Usuario {

	private int idUsuario;

	private String Email;

	private String Nome;

	private String Senha;

	public Usuario(int idUsuario, String email, String nome, String senha) {
		this.idUsuario = idUsuario;
		Email = email;
		Nome = nome;
		Senha = senha;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario{" +
				"idUsuario=" + idUsuario +
				", Email='" + Email + '\'' +
				", Nome='" + Nome + '\'' +
				", Senha='" + Senha + '\'' +
				'}';
	}
}
