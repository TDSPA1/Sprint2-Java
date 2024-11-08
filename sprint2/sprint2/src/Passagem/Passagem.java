package Passagem;

import java.util.Objects;

public class Passagem {
    private String id;
    private String nome;
    private double valor;
    private String formaDePagamento;
    private String horarioDePagamento;

    public void exibirDetalhes() {
        System.out.println("ID: " + id + " ,Nome: "+ nome + " ,Valor: " + valor + " ,forma de pagamento: " + formaDePagamento +" ,horario: "+horarioDePagamento);
    }

    public Passagem() {
    }

    public Passagem(String id, String nome, double valor, String formaDePagamento, String horarioDePagamento) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.formaDePagamento = formaDePagamento;
        this.horarioDePagamento = horarioDePagamento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getHorarioDePagamento() {
        return horarioDePagamento;
    }

    public void setHorarioDePagamento(String horarioDePagamento) {
        this.horarioDePagamento = horarioDePagamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passagem passagem)) return false;
        return Double.compare(valor, passagem.valor) == 0 && Objects.equals(id, passagem.id) && Objects.equals(nome, passagem.nome) && Objects.equals(formaDePagamento, passagem.formaDePagamento) && Objects.equals(horarioDePagamento, passagem.horarioDePagamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, valor, formaDePagamento, horarioDePagamento);
    }

    @Override
    public String toString() {
        return "Passagem{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", formaDePagamento='" + formaDePagamento + '\'' +
                ", horarioDePagamento='" + horarioDePagamento + '\'' +
                '}';
    }
}
