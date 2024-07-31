package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("admin", "1234", true);

        boolean acceso1 = usuario.permitirAcceso("admin", "1234");
        System.out.println("Acceso 1 (correcto): " + acceso1);

        boolean acceso2 = usuario.permitirAcceso("admin", "wrongpassword");
        System.out.println("Acceso 2 (incorrecto): " + acceso2);

        usuario.setEstadoSistema(false);
        boolean acceso3 = usuario.permitirAcceso("admin", "1234");
        System.out.println("Acceso 3 (estado del sistema no válido): " + acceso3);
    }
}
