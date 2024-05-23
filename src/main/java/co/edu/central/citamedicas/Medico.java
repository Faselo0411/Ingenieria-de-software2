package co.edu.central.citamedicas;
import java.util.ArrayList;
public class Medico extends Paciente {
    private String nombre;
    private ArrayList<CitaMedica> agenda;

    public Medico(String username, String password, String nombre) {
        super(username, password);
        this.nombre = nombre;
        this.agenda = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<CitaMedica> getAgenda() {
        return agenda;
    }

    public void agregarCita(CitaMedica cita) {
        this.agenda.add(cita);
    }

    public void registrarAtencion(CitaMedica cita, String observaciones) {
        if (!cita.isCancelada()) {
            cita.setObservaciones(observaciones);
            System.out.println("Atención registrada con éxito.");
        } else {
            System.out.println("No se puede registrar atención en una cita cancelada.");
        }
    }
}

