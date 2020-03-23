package br.com.bandtec.miseenscene.model;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "USUARIO_HABILIDADE")
public class HabilidadeUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHabilidadesUsuario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_HABILIDADE", nullable = false, foreignKey = @ForeignKey(name = "usuario_habilidade_id_habilidade_fkey"))
    @JsonIgnore
    private Habilidade habilidade;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_USUARIO", nullable = false, foreignKey = @ForeignKey(name = "usuario_habilidade_id_usuario_fkey"))
    @JsonIgnore
    private Usuario usuario;

    public HabilidadeUsuario() {
    }

    public HabilidadeUsuario(Habilidade habilidade, Usuario usuario) {
        this.habilidade = habilidade;
        this.usuario = usuario;
    }

    public HabilidadeUsuario(Long idHabilidadesUsuario, Habilidade habilidade, Usuario usuario) {
        this.idHabilidadesUsuario = idHabilidadesUsuario;
        this.habilidade = habilidade;
        this.usuario = usuario;
    }

    public Habilidade getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Habilidade habilidade) {
        this.habilidade = habilidade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getIdHabilidadesUsuario() {
        return idHabilidadesUsuario;
    }

    public void setIdHabilidadesUsuario(Long idHabilidadesUsuario) {
        this.idHabilidadesUsuario = idHabilidadesUsuario;
    }

    @Override
    public String toString() {
        return "HabilidadeUsuario{" +
                "idHabilidadesUsuario=" + idHabilidadesUsuario +
                ", habilidade=" + habilidade +
                ", usuario=" + usuario +
                '}';
    }
}