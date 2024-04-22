import java.util.ArrayList;
import java.util.Date;


public class CitaMedica {
    private Date fechaHora;
    private String motivo;
    private boolean cancelada;

    public CitaMedica(Date fechaHora, String motivo) {
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.cancelada = false;
    }

    public void cancelarCita() {
        this.cancelada = true;
    }
}

// Clase para manejar la lista de citas médicas
class AgendaMedica {
    private ArrayList<CitaMedica> citas;

    public AgendaMedica() {
        this.citas = new ArrayList<>();
    }

    public void agregarCita(CitaMedica cita) {
        this.citas.add(cita);
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


