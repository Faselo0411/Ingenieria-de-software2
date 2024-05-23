package modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "cita")
@Table(name = "Cita")

public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    Calendar claendario = new GregorianCalendar();
    private String hora;

    @OneToMany
    @JoinColumn (name="id_consultorio")
    private Consultorio consultorio;
    @OneToMany
    @JoinColumn (name="id_afiliado")
    private Afiliado afiliado;
    @OneToMany
    @JoinColumn (name="id_medico")
    private Medico medico;
    @OneToMany
    @JoinColumn (name="id_cancelación")
    private Cancelacioncita cancelacion;

    public Cita(Calendar claendario, String hora, Consultorio consultorio, Afiliado afiliado, Medico medico, Cancelacioncita cancelacion) {
        this.claendario = claendario;
        this.hora = hora;
        this.consultorio = consultorio;
        this.afiliado = afiliado;
        this.medico = medico;
        this.cancelacion = cancelacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getClaendario() {
        return claendario;
    }

    public void setClaendario(Calendar claendario) {
        this.claendario = claendario;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Cancelacioncita getCancelacion() {
        return cancelacion;
    }

    public void setCancelacion(Cancelacioncita cancelacion) {
        this.cancelacion = cancelacion;
    }
}
