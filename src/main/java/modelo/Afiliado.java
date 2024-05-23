package modelo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Afiliado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Afiliado afiliado;
    private String apellidos;
    private String cedula;

    public Afiliado(Afiliado afiliado, String apellidos, String cedula) {
        this.afiliado = afiliado;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }
    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
