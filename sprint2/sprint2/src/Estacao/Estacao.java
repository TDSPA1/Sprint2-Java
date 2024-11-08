package Estacao;

import java.util.ArrayList;
import java.util.Objects;

public class Estacao {
    private String id;
    private String nome;
    private String linha;
    private ArrayList<Estacao>estacoes = new ArrayList<>();

    public void adicionarEstacao(Estacao estacao){
        estacoes.add(estacao);
        System.out.println("Estacao adicionada: "+ estacao.getNome());
    }
    public void exibirEstacoes(){
        System.out.println("ID: "+ id +", Nome: "+ nome +", Linha: "+ linha);
    }


    //construtor vazio
    public Estacao() {
    }

    public Estacao(String id, String nome,String linha){ //construtor intermediario
        this.id = id;
        this.nome = nome;
        this.linha = linha;
        this.estacoes = new ArrayList<>();

    }

    public Estacao(String id, String nome, String linha, ArrayList<Estacao> estacoes) {
        this.id = id;
        this.nome = nome;
        this.linha = linha;
        this.estacoes = estacoes;
    }

    //getters and setters
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

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    //equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estacao estacao)) return false;
        return Objects.equals(id, estacao.id) && Objects.equals(nome, estacao.nome) && Objects.equals(linha, estacao.linha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, linha);
    }

    //tostring
    @Override
    public String toString() {
        return "Estacao{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", linha='" + linha + '\'' +
                '}';
    }
}
