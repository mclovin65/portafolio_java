package misMetodos;
import java.util.Scanner;
public class imc_{

        public static double calcularIMc(double peso, double altura) {
            return peso / (altura * altura);
        }

        public static void programaIMC() {
            Scanner intDato = new Scanner(System.in);

            System.out.print("Ingrese el peso: ");
            double peso = intDato.nextDouble();

            System.out.print("Ingrese la altura: ");
            double altura = intDato.nextDouble();

            double imc = calcularIMc(peso, altura);
            System.out.println("Tu IMC es: "+imc);}}










