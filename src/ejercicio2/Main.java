package ejercicio2;

public class Main {
    public static void main(String[] args) {
        CitaMedica cita = new CitaMedica("CITA001", "2024-08-15", "10:30",
                "Consultorio 101", "Dr. Pérez", "Juan Martínez", "Centro Médico ABC");

        System.out.println("Datos de la Cita Inicial:");
        cita.consultarDatosCita();

        cita.cambiarHora("11:00");
        System.out.println("Datos de la Cita Después de Cambiar la Hora:");
        cita.consultarDatosCita();
    }
}
