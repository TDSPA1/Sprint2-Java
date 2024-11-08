package Linha;

import java.util.Objects;

public class Linha {
    private String id;
    private String nome;
    private String cor;

    public void exibirDetalhes(){
        System.out.println("ID: " + id + ", Nome: " + nome + ", Cor: " + cor);
    }

    public Linha() {//construtor vazio
    }

    public Linha(String id, String nome, String cor) {//construtor completo
        this.id = id;
        this.nome = nome;
        this.cor = cor;
    }

    public String getId() {//getters and setters
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Linha linha)) return false;
        return Objects.equals(id, linha.id) && Objects.equals(nome, linha.nome) && Objects.equals(cor, linha.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cor);
    }

    //toostring
    @Override
    public String toString() {
        return "Linha{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
