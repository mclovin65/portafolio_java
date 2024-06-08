import termometro.termometro;
import fogel.Banner;
import misMetodos.imc_;
import opciones.opciones;
import java.util.Scanner;
import matematica.mate;
import calculadoraEdad.calculadoraDeEdad;
import lista.listaDeCompras;
import conversor.conversor;
public class Main {
    //metodo main
    public static void main(String[] args) {
       String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Celsius / faherenit", "Calcular edad",
                "convertor", "lista",
                "Opción_7", "Opción_8",
                "Opción_9", "Salir" };

                 Banner.mensaje();

          opciones.cargaropciones(listaDeOpciones);
        Scanner opcion = new Scanner(System.in);
        System.out.print("[%d]");
        int opcions = opcion.nextInt();
                  boolean programma=true;

                  do {
                      switch (opcions) {

                          case 1:
                              int opcion2;
                              System.out.println("+------------------+------------------+");
                              System.out.println("| 1. suma          | 2. resta      |");
                              System.out.println("| 3. divicion      | 4.multipli      |");
                              System.out.println("+------------------+------------------+");

                              mate.programa();
                              break;
                          case 2:
                              int opcion3;
                              imc_.terminal();
                          case 3:
                              int opcion5;
                              termometro.proigrama();
                              break;

                          case 4:
                            int opcion4;
                             calculadoraDeEdad calculadora = new calculadoraDeEdad();
                              calculadora.iniciar();
                              break;

                          case 5:
                             conversor.mostrarMenuPrincipal();

                             break;
                          case 6:
                              int opcion6;
                              listaDeCompras.programa(

                              );
                              break;

                          case 10:
                              programma = false;
                              break;
                      }
                  }while (programma);

    }
    }






