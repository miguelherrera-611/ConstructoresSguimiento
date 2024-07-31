package ejercicio6;

public class Envio {
    public String numeroGuia;
    private String fecha;
    private String tipoEmbalaje;
    public String cedulaCliente;
    private double peso;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double costo;
    private String estadoEnvio;

    public Envio(String numeroGuia, String fecha, String tipoEmbalaje, String cedulaCliente,
                 double peso, String ciudadOrigen, String ciudadDestino, double costo, String estadoEnvio) {
        this.numeroGuia = numeroGuia;
        this.fecha = fecha;
        this.tipoEmbalaje = tipoEmbalaje;
        this.cedulaCliente = cedulaCliente;
        this.peso = peso;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.costo = costo;
        this.estadoEnvio = estadoEnvio;
    }

    public double calcularCostoXkilo() {
        if (peso > 0) {
            return costo / peso;
        } else {
            System.out.println("Error: El peso debe ser mayor que cero.");
            return -1;
        }
    }

    public boolean verificarEntrega() {
        return "Entregado".equalsIgnoreCase(estadoEnvio);
    }
}

