package modelo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Medico medico;
    private String apellidos;
    private int cedula;
    private String especialidad;

    public Medico(Medico medico, String apellidos, int cedula, String especialidad) {
        this.medico = medico;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.especialidad = especialidad;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}

