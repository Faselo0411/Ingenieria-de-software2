package co.edu.central.citamedicas;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear instancia del sistema
        Sistema sistema = new Sistema();

        // Registrar médicos
        Medico medico1 = new Medico("medico1", "password1", "Dr. Juan Perez");
        sistema.registrarMedico(medico1);

        // Agregar citas a la agenda del médico
        medico1.agregarCita(new CitaMedica(new Date(), "Consulta general"));
        medico1.agregarCita(new CitaMedica(new Date(System.currentTimeMillis() + 3600 * 1000), "Chequeo anual"));

        // Autenticación del médico
        Medico medicoAutenticado = sistema.autenticarMedico("medico1", "password1");
        if (medicoAutenticado != null) {
            // Mostrar agenda del médico
            sistema.mostrarAgenda(medicoAutenticado);

            // Registrar atención médica
            CitaMedica cita = medicoAutenticado.getAgenda().get(0);
            sistema.registrarAtencion(medicoAutenticado, cita, "El paciente se encuentra en buen estado.");
        }
    }
}