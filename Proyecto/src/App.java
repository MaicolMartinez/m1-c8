import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var input = new Scanner(System.in);
        var salir = false;

        do {
            System.out.print("""
                    .: Ejercicios del Modulo 1 :.
                    ==============================
                    1. Verificar numeros negativos

                    0.Salir
                    
                        Elija una opcion: """);

            var opcion = input.nextInt();
            input.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    verificarNumero(input);
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
                    break;
            }

        } while (!salir);
        System.out.println("Gracias por usar el programa");
        input.close();

    }

    private static void verificarNumero(Scanner input) {

        /*
         * Escriba un programa que permita ingresar un número real e identifique si el
         * número es negativo, positivo o cero.
         */
        System.out.print("Ingrese un numero a evaluar: ");
        var real = input.nextDouble();

        if (real == 0) {
            System.out.println("El numero es positivo");
        } else if (real < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");

        }
    }
}
