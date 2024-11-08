package Notificacao;

import Usuario.Usuario;

import java.util.Objects;

public class Notificacao {
    private String id;
    private Usuario usuario;
    private String mensagem;
    private String dataEnvio;

    public void enviarNotificacao() {
        System.out.println("enviando notificacao para " + usuario.getNome() + ":" + mensagem);
    }

    public void exibirNotificacao() {
        System.out.println("ID: " + id + ", Usuário: " + usuario.getNome() + ", Mensagem: " + mensagem + ", Data: " + dataEnvio);
    }

    public Notificacao() {
    }

    public Notificacao(String id, Usuario usuario, String mensagem, String dataEnvio) {
        this.id = id;
        this.usuario = usuario;
        this.mensagem = mensagem;
        this.dataEnvio = dataEnvio;
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

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notificacao that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(usuario, that.usuario) && Objects.equals(mensagem, that.mensagem) && Objects.equals(dataEnvio, that.dataEnvio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, usuario, mensagem, dataEnvio);
    }

    @Override
    public String toString() {
        return "Notificacao{" +
                "id='" + id + '\'' +
                ", usuario=" + usuario +
                ", mensagem='" + mensagem + '\'' +
                ", dataEnvio='" + dataEnvio + '\'' +
                '}';
    }
}