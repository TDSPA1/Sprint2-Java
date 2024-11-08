package InfraestruturaVia;

import java.util.Objects;

public class InfraestruturaVia {
    private String id;
    private String localizacao;
    private String estadoDeConservacao;
    private String dataDeManutencao;
    private String linha;

    public void exibirInformacao(){
        System.out.println("ID: " + id + ", Localizcao: " + localizacao + ", Estado de conservacao: " + estadoDeConservacao + ", Data de manutencao: " + dataDeManutencao + ",Linha: "+ linha);;
    }
    public InfraestruturaVia() {
    }

    public InfraestruturaVia(String id, String localizacao, String estadoDeConservacao, String dataDeManutencao, String linha) {
        this.id = id;
        this.localizacao = localizacao;
        this.estadoDeConservacao = estadoDeConservacao;
        this.dataDeManutencao = dataDeManutencao;
        this.linha = linha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getEstadoDeConservacao() {
        return estadoDeConservacao;
    }

    public void setEstadoDeConservacao(String estadoDeConservacao) {
        this.estadoDeConservacao = estadoDeConservacao;
    }

    public String getDataDeManutencao() {
        return dataDeManutencao;
    }

    public void setDataDeManutencao(String dataDeManutencao) {
        this.dataDeManutencao = dataDeManutencao;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InfraestruturaVia that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(localizacao, that.localizacao) && Objects.equals(estadoDeConservacao, that.estadoDeConservacao) && Objects.equals(dataDeManutencao, that.dataDeManutencao) && Objects.equals(linha, that.linha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, localizacao, estadoDeConservacao, dataDeManutencao, linha);
    }

    @Override
    public String toString() {
        return "InfraestruturaDasVias{" +
                "id='" + id + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", estadoDeConservacao='" + estadoDeConservacao + '\'' +
                ", dataDeManutencao='" + dataDeManutencao + '\'' +
                ", linha='" + linha + '\'' +
                '}';
    }
}
