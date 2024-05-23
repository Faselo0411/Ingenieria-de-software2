package co.edu.central.citamedicas;

import java.util.HashMap;

public class Sistema {

    private HashMap<String, Medico> medicos;

    public Sistema() {
        this.medicos = new HashMap<>();
    }

    public void registrarMedico(Medico medico) {
        medicos.put(medico.getUsername(), medico);
    }

    public Medico autenticarMedico(String username, String password) {
        Medico medico;
        medico = medicos.get(username);
        if (medico != null && medico.getPassword().equals(password)) {
            System.out.println("Autenticación exitosa. Bienvenido, " + medico.getNombre() + "!");
            return medico;
        } else {
            System.out.println("Autenticación fallida. Por favor, verifique sus credenciales.");
            return null;
        }
    }

    public void mostrarAgenda(Medico medico) {
        System.out.println("Agenda de citas para el día:");
        for (CitaMedica cita : medico.getAgenda()) {
            System.out.println("Fecha y Hora: " + cita.getFechaHora() + ", Motivo: " + cita.getMotivo());
        }
    }

    public void registrarAtencion(Medico medico, CitaMedica cita, String observaciones) {
        medico.registrarAtencion(cita, observaciones);
    }
}
