package ejercicio2;

public class CitaMedica {
    public String codCita;
    public String fecha; // en formato "YYYY-MM-DD"
    public String hora;  // en formato "HH:MM"
    public String consultorio;
    public String nombreMedico;
    public String nombrePaciente;

    private String centroMedico;

    public CitaMedica(String codCita, String fecha, String hora, String consultorio,
                      String nombreMedico, String nombrePaciente, String centroMedico) {
        this.codCita = codCita;
        this.fecha = fecha;
        this.hora = hora;
        this.consultorio = consultorio;
        this.nombreMedico = nombreMedico;
        this.nombrePaciente = nombrePaciente;
        this.centroMedico = centroMedico;
    }

    public void crearCita(String codCita, String fecha, String hora, String consultorio,
                          String nombreMedico, String nombrePaciente, String centroMedico) {
        this.codCita = codCita;
        this.fecha = fecha;
        this.hora = hora;
        this.consultorio = consultorio;
        this.nombreMedico = nombreMedico;
        this.nombrePaciente = nombrePaciente;
        this.centroMedico = centroMedico;
    }

    public void consultarDatosCita() {
        System.out.print("Código de Cita: " + codCita);
        System.out.print(" | Fecha: " + fecha);
        System.out.print(" | Hora: " + hora);
        System.out.print(" | Consultorio: " + consultorio);
        System.out.print(" | Nombre del Médico: " + nombreMedico);
        System.out.print(" | Nombre del Paciente: " + nombrePaciente);
        System.out.print(" | Centro Médico: " + centroMedico);
        System.out.println(); // Añade una línea en blanco al final para separar salidas
    }

    public void cambiarHora(String nuevaHora) {
        this.hora = nuevaHora;
    }

    public String getCentroMedico() {
        return centroMedico;
    }

    public void setCentroMedico(String centroMedico) {
        this.centroMedico = centroMedico;
    }
}
