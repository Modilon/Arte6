package br.com.bandtec.miseenscene.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "HABILIDADE")
public class Habilidade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(
            name = "habilidade_generator",
            sequenceName = "habilidade_sequence",
            initialValue = 1
    )
    private Long idHabilidade;

    @NotEmpty
    @Column(name = "NOME_HABILIDADE")
    private String nomeHabilidade;

    @OneToMany(mappedBy = "habilidade", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<HabilidadeUsuario> habilidadeUsuarios = new HashSet<>();

    public Habilidade() {
    }

    public Habilidade(@NotEmpty String nomeHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
    }

    public Habilidade(@NotEmpty Long idHabilidade, @NotEmpty String nomeHabilidade) {
        this.idHabilidade = idHabilidade;
        this.nomeHabilidade = nomeHabilidade;
    }

    public void setIdHabilidade(Long idHabilidade) {
        this.idHabilidade = idHabilidade;
    }

    public Long getIdHabilidade() {
        return idHabilidade;
    }

    public void setNomeHabilidade(String nomeHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
    }

    public String getNomeHabilidade() {
        return nomeHabilidade;
    }

    public Set<HabilidadeUsuario> getHabilidadeUsuarios() {
        return habilidadeUsuarios;
    }

    public void setHabilidadeUsuarios(Set<HabilidadeUsuario> habilidadeUsuarios) {
        this.habilidadeUsuarios = habilidadeUsuarios;
    }

    @Override
    public String toString() {
        return "Habilidade{" +
                "idHabilidade=" + idHabilidade +
                ", nomeHabilidade='" + nomeHabilidade + '\'' +
                '}';
    }
}
