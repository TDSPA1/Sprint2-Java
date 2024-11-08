package Reserva;

import Usuario.Usuario;
import Estacao.Estacao;

import java.util.Objects;

public class Reserva {
    private String id;
    private Usuario usuario;
    private Estacao estacaoOrigem;
    private Estacao estacaoDestino;
    private String data;
    private boolean statusDaReserva;

    public void exibirDetalhesDaReserva(){
            System.out.println("Reserva ID: " + id + ", Usuário: " + usuario.getNome() + ", De: " + estacaoOrigem.getNome() + ", Para: " + estacaoDestino.getNome() + ", Data: " + data);
    }

    public void confirmarReserva(){
        this.statusDaReserva = true;
        System.out.println("reserva confirmada para passageiro: "+ usuario.getNome());
    }

    public Reserva() {
    }

    public Reserva(String id, Usuario usuario, Estacao estacaoOrigem, Estacao estacaoDestino, String data, boolean statusDaReserva) {
        this.id = id;
        this.usuario = usuario;
        this.estacaoOrigem = estacaoOrigem;
        this.estacaoDestino = estacaoDestino;
        this.data = data;
        this.statusDaReserva = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Estacao getEstacaoOrigem() {
        return estacaoOrigem;
    }

    public void setEstacaoOrigem(Estacao estacaoOrigem) {
        this.estacaoOrigem = estacaoOrigem;
    }

    public Estacao getEstacaoDestino() {
        return estacaoDestino;
    }

    public void setEstacaoDestino(Estacao estacaoDestino) {
        this.estacaoDestino = estacaoDestino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isStatusDaReserva() {
        return statusDaReserva;
    }

    public void setStatusDaReserva(boolean statusDaReserva) {
        this.statusDaReserva = statusDaReserva;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reserva reserva)) return false;
        return statusDaReserva == reserva.statusDaReserva && Objects.equals(id, reserva.id) && Objects.equals(usuario, reserva.usuario) && Objects.equals(estacaoOrigem, reserva.estacaoOrigem) && Objects.equals(estacaoDestino, reserva.estacaoDestino) && Objects.equals(data, reserva.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, usuario, estacaoOrigem, estacaoDestino, data, statusDaReserva);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id='" + id + '\'' +
                ", usuario=" + usuario +
                ", estacaoOrigem=" + estacaoOrigem +
                ", estacaoDestino=" + estacaoDestino +
                ", data='" + data + '\'' +
                ", statusDaReserva=" + statusDaReserva +
                '}';
    }
}
