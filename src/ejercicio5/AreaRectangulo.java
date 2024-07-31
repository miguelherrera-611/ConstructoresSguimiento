package ejercicio5;

public class AreaRectangulo {
    public double base;
    public double altura;

    public AreaRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public boolean validarDatosIngresados() {
        return base > 0 && altura > 0;
    }

    public double calcularArea() {
        if (validarDatosIngresados()) {
            return base * altura;
        } else {
            System.out.println("Error: Los datos ingresados no son válidos.");
            return -1;
        }
    }
}
