package conversor;

import java.util.Scanner;

public class conversor {

    public static void mostrarMenuPrincipal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("**** Menú Principal ****\n1. Medidas de Longitud\nEscoja la opción deseada:");

        if (sc.nextInt() == 1) {
            mostrarMenuLongitud(sc);
        }

        sc.close();
    }

    public static void mostrarMenuLongitud(Scanner sc) {
        System.out.println("\n*** Medidas de Longitud ***\n1. Pulgadas a Milímetros\n2. Yardas a Metros\nEscoja la opción que desea:");
        int opcion = sc.nextInt();
        System.out.println(opcion == 1 ? "Ingrese la cantidad de pulgadas a convertir:" : "Ingrese la cantidad de yardas a convertir:");
        double med1 = sc.nextDouble();
        double med2 = opcion == 1 ? convertirPulgadasAMilimetros(med1) : convertirYardasAMetros(med1);
        System.out.println(med1 + (opcion == 1 ? " pulgadas equivalen a " : " yardas equivalen a ") + med2 + (opcion == 1 ? " milímetros" : " metros"));
    }

    public static double convertirPulgadasAMilimetros(double pulgadas) {
        return pulgadas * 25.40;
    }

    public static double convertirYardasAMetros(double yardas) {
        return yardas * 0.9144;
    }
}

