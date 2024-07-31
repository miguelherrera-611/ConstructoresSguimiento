package ejercicio3;

public class PrestamoLibro {
    public String codPrestamo;
    public String fechaPrestamo; // en formato "YYYY-MM-DD"
    public String nombreLibro;
    public String codigoUsuario;
    public int diasDePrestamo;
    public String estadoPrestamo;

    public PrestamoLibro(String codPrestamo, String fechaPrestamo, String nombreLibro,
                         String codigoUsuario, int diasDePrestamo, String estadoPrestamo) {
        this.codPrestamo = codPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.nombreLibro = nombreLibro;
        this.codigoUsuario = codigoUsuario;
        this.diasDePrestamo = diasDePrestamo;
        this.estadoPrestamo = estadoPrestamo;
    }

    public String consultarEstadoPrestamo() {
        return "Estado del Préstamo: " + estadoPrestamo;
    }

    public void consultarDatosPrestamo() {
        System.out.print("Código de Préstamo: " + codPrestamo);
        System.out.print(" | Fecha de Préstamo: " + fechaPrestamo);
        System.out.print(" | Nombre del Libro: " + nombreLibro);
        System.out.print(" | Código de Usuario: " + codigoUsuario);
        System.out.print(" | Días de Préstamo: " + diasDePrestamo);
        System.out.print(" | Estado del Préstamo: " + estadoPrestamo);
    }

    public String getEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo( String estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }
}

