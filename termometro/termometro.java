package termometro;

import java.util.Scanner;
public class termometro {

public static void proigrama() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de grados Celsius a convertir:");
    double celsius = sc.nextDouble();
    double fahrenheit = convertirCelsiusAFahrenheit(celsius);
    System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit");

    sc.close();
}

public static double convertirCelsiusAFahrenheit(double celsius) {
    return (9.0 / 5.0) * celsius + 32;
}
}
