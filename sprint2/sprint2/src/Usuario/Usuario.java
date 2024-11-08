package Usuario;

import java.util.Objects;

public class Usuario {
    //atributos
    private String id;
    private String nome;
    private String cpf;
    private String genero;
    private String dataDeAniversario;

    private void tamanhoDoCpf(String cpf){
        if (cpf.length() == 11){  //cpf possui 11 numeros
            System.out.println("cpf válido");
        }else {
            System.out.println("cpf com tamanho inválido ou vazio");
        }
    }
    public void exibirDados(){
        System.out.println("ID: "+ id + " ,Nome: "+ nome + " ,Cpf: "+ cpf + " ,Genero: "+ genero +" ,Data de Nascimento: "+ dataDeAniversario);

    }

    //construtor vazio
    public Usuario() {
    }

    //construtor completo
    public Usuario(String id, String nome, String cpf, String genero, String dataDeAniversario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.dataDeAniversario = dataDeAniversario;
    }

    //getter and setters
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDataDeAniversario() {
        return dataDeAniversario;
    }

    public void setDataDeAniversario(String dataDeAniversario) {
        this.dataDeAniversario = dataDeAniversario;
    }

    //equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;
        return Objects.equals(id, usuario.id) && Objects.equals(nome, usuario.nome) && Objects.equals(cpf, usuario.cpf) && Objects.equals(genero, usuario.genero) && Objects.equals(dataDeAniversario, usuario.dataDeAniversario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf, genero, dataDeAniversario);
    }

    //toString
    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", genero='" + genero + '\'' +
                ", dataDeAniversario='" + dataDeAniversario + '\'' +
                '}';
    }
}
