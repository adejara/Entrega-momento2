import java.util.Scanner;

public class MontanaRusa {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad;
        int estatura;
        String respuestaCardiaca;
        String respuestaAdulto;

        System.out.print("Ingrese la edad: ");
        edad = entrada.nextInt();

        System.out.print("Ingrese la estatura en centímetros: ");
        estatura = entrada.nextInt();

        System.out.print("¿Tiene una condición cardíaca? si/no: ");
        respuestaCardiaca = entrada.next();

        System.out.print("¿Está acompañado por un adulto? si/no: ");
        respuestaAdulto = entrada.next();

        boolean tieneCondicionCardiaca =
                respuestaCardiaca.equalsIgnoreCase("si");

        boolean conAdulto =
                respuestaAdulto.equalsIgnoreCase("si");

        if (tieneCondicionCardiaca) {
            System.out.println("Acceso Denegado");

        } else if (estatura < 130 || edad < 10) {
            System.out.println("Acceso Denegado");

        } else if (edad >= 10 && edad <= 15) {

            if (conAdulto) {
                System.out.println(
                        "Acceso Restringido (Requiere Adulto)"
                );
            } else {
                System.out.println("Acceso Denegado");
            }

        } else if (edad > 15 && estatura > 130) {
            System.out.println("Acceso Permitido");

        } else {
            System.out.println("Acceso Denegado");
        }

        entrada.close();
    }
}
