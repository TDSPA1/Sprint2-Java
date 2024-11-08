package TransporteFerroviario;

import java.util.Objects;

public class TransporteFerroviario {
    private String id;
    private int numeroDeVagao;
    private int capacidadeMax;
    private int capacidadeMin;
    private String linhaDaRota;
    private String horarioSaida;
    private String horarioChegada;

    public void exibirDetalhes() {
        System.out.println("ID: " + id + " ,numeroDeVagao:  " + numeroDeVagao + " ,capacidadeMax : " + capacidadeMax + " ,capacidadeMin: " + capacidadeMin);
    }
    public TransporteFerroviario() {
    }

    public TransporteFerroviario(String id, int numeroDeVagao, int capacidadeMax, int capacidadeMin, String linhaDaRota, String horarioSaida, String horarioChegada) {
        this.id = id;
        this.numeroDeVagao = numeroDeVagao;
        this.capacidadeMax = capacidadeMax;
        this.capacidadeMin = capacidadeMin;
        this.linhaDaRota = linhaDaRota;
        this.horarioSaida = horarioSaida;
        this.horarioChegada = horarioChegada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumeroDeVagao() {
        return numeroDeVagao;
    }

    public void setNumeroDeVagao(int numeroDeVagao) {
        this.numeroDeVagao = numeroDeVagao;
    }

    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public int getCapacidadeMin() {
        return capacidadeMin;
    }

    public void setCapacidadeMin(int capacidadeMin) {
        this.capacidadeMin = capacidadeMin;
    }

    public String getLinhaDaRota() {
        return linhaDaRota;
    }

    public void setLinhaDaRota(String linhaDaRota) {
        this.linhaDaRota = linhaDaRota;
    }

    public String getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public String getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(String horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransporteFerroviario that)) return false;
        return numeroDeVagao == that.numeroDeVagao && capacidadeMax == that.capacidadeMax && capacidadeMin == that.capacidadeMin && Objects.equals(id, that.id) && Objects.equals(linhaDaRota, that.linhaDaRota) && Objects.equals(horarioSaida, that.horarioSaida) && Objects.equals(horarioChegada, that.horarioChegada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroDeVagao, capacidadeMax, capacidadeMin, linhaDaRota, horarioSaida, horarioChegada);
    }

    @Override
    public String toString() {
        return "TransporteFerroviaria{" +
                "id='" + id + '\'' +
                ", numeroDeVagao=" + numeroDeVagao +
                ", capacidadeMax=" + capacidadeMax +
                ", capacidadeMin=" + capacidadeMin +
                ", linhaDaRota='" + linhaDaRota + '\'' +
                ", horarioSaida='" + horarioSaida + '\'' +
                ", horarioChegada='" + horarioChegada + '\'' +
                '}';
    }
}
