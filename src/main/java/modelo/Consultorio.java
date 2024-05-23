package modelo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Consultorio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Consultorio consultorio;
    private String direccion;
    public Consultorio(Consultorio consultorio, String direccion) {
        this.consultorio = consultorio;
        this.direccion = direccion;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
