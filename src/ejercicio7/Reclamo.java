package ejercicio7;

public class Reclamo {
    public String numeroReclamo;
    private String nombrePersona;
    private String asunto;
    public String descripcionReclamo;
    private String estadoReclamo;

    public Reclamo(String numeroReclamo, String nombrePersona, String asunto,
                   String descripcionReclamo, String estadoReclamo) {
        this.numeroReclamo = numeroReclamo;
        this.nombrePersona = nombrePersona;
        this.asunto = asunto;
        this.descripcionReclamo = descripcionReclamo;
        this.estadoReclamo = estadoReclamo;
    }

    public boolean validarEstadoReclamo() {
        return "Pendiente".equalsIgnoreCase(estadoReclamo) ||
                "En Proceso".equalsIgnoreCase(estadoReclamo) ||
                "Resuelto".equalsIgnoreCase(estadoReclamo);
    }

    public String mensajeRecepcionReclamo() {
        if (validarEstadoReclamo()) {
            return "Reclamo recibido con éxito. Número de Reclamo: " + numeroReclamo +
                    ". Estado actual: " + estadoReclamo + ".";
        } else {
            return "Error: El estado del reclamo no es válido. Número de Reclamo: " + numeroReclamo;
        }
    }
}

