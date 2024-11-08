package RegistroDeIncidente;

import java.util.Objects;

public class RegistroDeIncidente {
    private String id;
    private String dataDOIncidente;
    private String status;
    private String transporte;

    public void exibirIncidente() {
        System.out.println("ID: " + id + ", Transporte: " + transporte + ", Data: " + dataDOIncidente + ", Status: " + status);
    }

    public RegistroDeIncidente() {
    }

    public RegistroDeIncidente(String id, String dataDOIncidente, String status, String transporte) {
        this.id = id;
        this.dataDOIncidente = dataDOIncidente;
        this.status = status;
        this.transporte = transporte;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDataDOIncidente() {
        return dataDOIncidente;
    }

    public void setDataDOIncidente(String dataDOIncidente) {
        this.dataDOIncidente = dataDOIncidente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegistroDeIncidente that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(dataDOIncidente, that.dataDOIncidente) && Objects.equals(status, that.status) && Objects.equals(transporte, that.transporte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataDOIncidente, status, transporte);
    }

    @Override
    public String toString() {
        return "RegistroDeIncidente{" +
                "id='" + id + '\'' +
                ", dataDOIncidente='" + dataDOIncidente + '\'' +
                ", status='" + status + '\'' +
                ", transporte='" + transporte + '\'' +
                '}';
    }
}
