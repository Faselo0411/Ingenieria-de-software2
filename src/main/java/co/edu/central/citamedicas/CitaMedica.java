package co.edu.central.citamedicas;

import java.util.Date;


public class CitaMedica {
    private Date fechaHora;
    private String motivo;
    private boolean cancelada;
    private String observaciones;

    public CitaMedica(Date fechaHora, String motivo) {
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.cancelada = false;
        this.observaciones = "";
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public String getMotivo() {
        return motivo;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void cancelarCita() {
        this.cancelada = true;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public void cancelarCita(CitaMedica cita) {
        if (!cita.isCancelada()) {
            long horasRestantes = (cita.getFechaHora().getTime() - new Date().getTime()) / (60 * 60 * 1000);
            if (horasRestantes >= 24) {
                cita.cancelarCita();
                System.out.println("La cita ha sido cancelada con éxito.");
            } else {
                System.out.println("No se puede cancelar la cita. Debe hacerlo con al menos 24 horas de anticipación.");
            }
        } else {
            System.out.println("La cita ya ha sido cancelada anteriormente.");
        }
    }
}

