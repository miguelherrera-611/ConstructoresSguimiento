package ejercicio7;

public class Main {
    public static void main(String[] args) {
        Reclamo reclamo1 = new Reclamo("RECL001", "Juan Pérez", "Problema con la factura",
                "Descripción detallada del reclamo", "Pendiente");

        System.out.println(reclamo1.mensajeRecepcionReclamo());

        Reclamo reclamo2 = new Reclamo("RECL002", "Ana García", "Problema con el producto",
                "Descripción del reclamo", "No Válido");

        System.out.println(reclamo2.mensajeRecepcionReclamo());
    }
}

