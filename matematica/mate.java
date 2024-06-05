package matematica;
import opciones.opciones;
import java.util.Scanner;

public class mate {
    public static  void mate() {
        String[] Opciones = {
                "suma", "resta", "multiplicacion", "divicion"};
        opciones.cargaropciones(Opciones);
        // Funciones para operaciones matemáticas
    }    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {

            return Double.NaN;
        }
        return a / b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método principal del programa
    public static void programa() {
            Scanner scanner = new Scanner(System.in);


            int opcion = scanner.nextInt();

            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;
            boolean operacionValida = true;

            switch (opcion) {
                case 1:
                    resultado = sumar(num1, num2);
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    break;
                case 3:
                    resultado = dividir(num1, num2);
                    break;
                case 4:
                    resultado = multiplicar(num1, num2);
                    break;

            }


            System.out.println("El resultado es: " + resultado);
        }
    }

