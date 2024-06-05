import termometro.termometro;
import fogel.Banner;
import misMetodos.imc_;
import opciones.opciones;
import java.util.Scanner;
import matematica.mate;
import calculadoraEdad.calculadoraDeEdad;
import lista.listaDeCompras;
public class Main {
    //metodo main
    public static void main(String[] args) {
       String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Farenheit / Celsius", "Calcular edad",
                "Grados", "lista",
                "Opción_7", "Opción_8",
                "Opción_9", "Salir" };



          opciones.cargaropciones(listaDeOpciones);
        Scanner opcion = new Scanner(System.in);
        System.out.print("[%d]");
        int opcions = opcion.nextInt();
                  boolean programma=true;

                  do {
                      switch (opcions) {

                          case 1:
                              int opcion2;

                              mate.programa();
                              break;
                          case 3:
                              int opcion3;
                              termometro.gradosxd();
                              break;

                          case 4:
                            int opcion4;
                             calculadoraDeEdad calculadora = new calculadoraDeEdad();
                              calculadora.iniciar();
                              break;

                          case 5:
                              int opcion5;
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






