package ejercicio6;

public class Main {
    public static void main(String[] args) {
        Envio envio1 = new Envio("GUÍA123", "2024-07-31", "Caja", "1234567890",
                10.0, "Ciudad A", "Ciudad B", 200.0, "Entregado");

        double costoPorKilo = envio1.calcularCostoXkilo();
        if (costoPorKilo != -1) {
            System.out.println("Costo por Kilo: " + costoPorKilo);
        }

        boolean entregaVerificada = envio1.verificarEntrega();
        System.out.println("¿El envío ha sido entregado?: " + entregaVerificada);

        Envio envio2 = new Envio("GUÍA456", "2024-07-31", "Sobre", "0987654321",
                0.0, "Ciudad C", "Ciudad D", 0.0, "En tránsito");

        double costoPorKilo2 = envio2.calcularCostoXkilo();
        if (costoPorKilo2 != -1) {
            System.out.println("Costo por Kilo: " + costoPorKilo2);
        }

        boolean entregaVerificada2 = envio2.verificarEntrega();
        System.out.println("¿El envío ha sido entregado?: " + entregaVerificada2);
    }
}
