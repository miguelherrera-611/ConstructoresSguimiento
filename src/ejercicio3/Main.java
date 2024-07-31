package ejercicio3;

public class Main {
    public static void main(String[] args) {
        PrestamoLibro prestamo = new PrestamoLibro("PRESTAMO001", "2024-07-31", "Java Programming",
                "USUARIO123", 14, "Activo");

        System.out.println("Consulta del Estado del Préstamo:");
        System.out.println(prestamo.consultarEstadoPrestamo());
        System.out.println();

        System.out.println("Datos del Préstamo:");
        prestamo.consultarDatosPrestamo();

        prestamo.setEstadoPrestamo("Finalizado");
        System.out.println("Datos del Préstamo Después de Cambiar el Estado:");
        prestamo.consultarDatosPrestamo();
    }
}
