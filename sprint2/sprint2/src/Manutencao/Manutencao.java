package Manutencao;

import java.util.Objects;

public class Manutencao {
    private String id;
    private String tipoDeManutencao;
    private String tecnicoResponsavel;
    private String descricao;
    private String localizacao;

    public void exibirManutencao() {
        System.out.println("ID: " + id + ", Tipo de manutencao: " + tipoDeManutencao + ", tecnico responsavel: " + tecnicoResponsavel + ", Descrição: " + descricao + ",localizacao: " + localizacao);
    }

    public Manutencao() {
    }

    public Manutencao(String id, String tipoDeManutencao, String tecnicoResponsavel, String descricao, String localizacao) {
        this.id = id;
        this.tipoDeManutencao = tipoDeManutencao;
        this.tecnicoResponsavel = tecnicoResponsavel;
        this.descricao = descricao;
        this.localizacao = localizacao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoDeManutencao() {
        return tipoDeManutencao;
    }

    public void setTipoDeManutencao(String tipoDeManutencao) {
        this.tipoDeManutencao = tipoDeManutencao;
    }

    public String getTecnicoResponsavel() {
        return tecnicoResponsavel;
    }

    public void setTecnicoResponsavel(String tecnicoResponsavel) {
        this.tecnicoResponsavel = tecnicoResponsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manutencao that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(tipoDeManutencao, that.tipoDeManutencao) && Objects.equals(tecnicoResponsavel, that.tecnicoResponsavel) && Objects.equals(descricao, that.descricao) && Objects.equals(localizacao, that.localizacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipoDeManutencao, tecnicoResponsavel, descricao, localizacao);
    }

    @Override
    public String toString() {
        return "Manutencao{" +
                "id='" + id + '\'' +
                ", tipoDeManutencao='" + tipoDeManutencao + '\'' +
                ", tecnicoResponsavel='" + tecnicoResponsavel + '\'' +
                ", descricao='" + descricao + '\'' +
                ", localizacao='" + localizacao + '\'' +
                '}';
    }
}
