package ejercicio5;

public class Main {
    public static void main(String[] args) {
        AreaRectangulo rectangulo1 = new AreaRectangulo(5.0, 3.0);
        System.out.println("Área del Rectángulo 1: " + rectangulo1.calcularArea());

        AreaRectangulo rectangulo2 = new AreaRectangulo(-5.0, 3.0);
        System.out.println("Área del Rectángulo 2: " + rectangulo2.calcularArea());
    }
}
