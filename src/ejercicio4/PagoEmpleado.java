package ejercicio4;

public class PagoEmpleado {
    public String codEmpleado;
    private double salarioBasico;
    public double horasExtras;
    private int numeroHoras;
    private double descuento;
    private double descuentoPrestamo;
    public double bonificacion;
    private double neto;

    public PagoEmpleado(String codEmpleado, double salarioBasico, double horasExtras, int numeroHoras,
                        double descuento, double descuentoPrestamo, double bonificacion) {
        this.codEmpleado = codEmpleado;
        this.salarioBasico = salarioBasico;
        this.horasExtras = horasExtras;
        this.numeroHoras = numeroHoras;
        this.descuento = descuento;
        this.descuentoPrestamo = descuentoPrestamo;
        this.bonificacion = bonificacion;
    }

    public double calcularValorHE() {
        double tarifaHoraExtra = salarioBasico / 160 * 1.5;
        return horasExtras * tarifaHoraExtra;
    }

    public double calcularDevengado() {
        return salarioBasico + calcularValorHE() + bonificacion;
    }

    public double calcularDeducido() {
        return descuento + descuentoPrestamo;
    }

    public double calcularNeto() {
        neto = calcularDevengado() - calcularDeducido();
        return neto;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public double getNeto() {
        return neto;
    }
}
