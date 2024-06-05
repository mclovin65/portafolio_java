package termometro;

import java.util.Scanner;

public class termometro {
;
        public static void gradosxd() {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Ingrese la temperatura en Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("La temperatura en Celsius es: " + celsius);

            scanner.close();
        }}
