package calculadoraEdad;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class calculadoraDeEdad {
    public int iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.print("Año: ");
        int year = scanner.nextInt();
        System.out.print("Mes: ");
        int month = scanner.nextInt();
        System.out.print("Día: ");
        int day = scanner.nextInt();

        LocalDate fechaNacimiento = LocalDate.of(year, month, day);
        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, fechaActual);
        int edadAnios = periodo.getYears();
        int mesesRestantes = periodo.getMonths();
        int diasRestantes = periodo.getDays();

        System.out.print("Su edad es: " + edadAnios + " años");
        if (mesesRestantes > 0) {
            System.out.print(", " + mesesRestantes + " meses");
        }
        if (diasRestantes > 0) {
            System.out.print(" y " + diasRestantes + " días");
        }
        System.out.println(".");

        return edadAnios;
    }
}
