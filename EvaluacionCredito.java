import java.util.Scanner;

public class EvaluacionCredito {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double ingresos;
        int puntaje;
        String respuestaDeudas;
        boolean tieneDeudas;

        System.out.print("Ingrese los ingresos mensuales del cliente: ");
        ingresos = entrada.nextDouble();

        System.out.print("Ingrese el puntaje crediticio del cliente (0 a 1000): ");
        puntaje = entrada.nextInt();

        System.out.print("¿Tiene deudas activas? si/no: ");
        respuestaDeudas = entrada.next();

        tieneDeudas = respuestaDeudas.equalsIgnoreCase("si");

        if (tieneDeudas && puntaje < 600) {

            System.out.println("Crédito Rechazado");

        } else if (!tieneDeudas && ingresos > 3000 && puntaje > 750) {

            System.out.println("Crédito Aprobado con tasa preferencial (5%)");

        } else if (tieneDeudas && puntaje > 800) {

            System.out.println("Crédito Aprobado con tasa estándar (10%)");

        } else if (ingresos > 1500) {

            System.out.println("Crédito en Revisión Manual");

        } else {

            System.out.println("Crédito Rechazado");
        }

        entrada.close();
    }
}
