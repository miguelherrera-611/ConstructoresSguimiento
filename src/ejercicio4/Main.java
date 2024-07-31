package ejercicio4;

public class Main {
    public static void main(String[] args) {
        PagoEmpleado empleado = new PagoEmpleado("EMP001", 2000.00, 10, 40,
                150.00, 100.00, 200.00);

        double valorHorasExtras = empleado.calcularValorHE();
        System.out.println("Valor de Horas Extras: " + valorHorasExtras);

        double devengado = empleado.calcularDevengado();
        System.out.println("Salario Devengado: " + devengado);

        double deducido = empleado.calcularDeducido();
        System.out.println("Salario Deducido: " + deducido);

        double neto = empleado.calcularNeto();
        System.out.println("Salario Neto: " + neto);
    }
}
