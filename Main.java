import conversor.termometro;
import interfaz_grafica.Banner;
import imc.IMC;
import misMetodos.opciones;
import java.util.Scanner;
import calculadora.mate;
import calculadora.calculadoraDeEdad;
import lista.listaDeCompras;
import conversor.conversor;
import conversor.monedas;
import misMetodos.metodos;
import biblioteca.libro;
import mclovin.estudiantes;
import mclovin.cursos;
import mclovin.escuela;
public class Main {
    //metodo main
    public static void main(String[] args) {
        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Celsius / faherenit", "Calcular edad",
                "convertor", "lista",
                "conversor monedas", "Opción_8",
                "escuela", "Salir"};
                  boolean programma=true;
                  do {

                      metodos.limpiarconsola();
                      Banner.mensaje();
                      metodos.imprimirlinea();
                      opciones.cargaropciones(listaDeOpciones);
                      Scanner opcion = new Scanner(System.in);
                      System.out.print("[%d]");
                      int opcions = opcion.nextInt();
                      switch (opcions) {

                          case 1:
                              int opcion2;
                             metodos.imprimirlinea();
                              System.out.println("| 1. suma          | 2. resta      |");
                              System.out.println("| 3. divicion      | 4.multipli      |");
                             metodos.imprimirlinea();

                              mate.programa();
                              break;
                          case 2:
                              int opcion3;
                              IMC.terminal();

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
                          case 7:
                            monedas.conversor();
                          case 9:
                              escuela.programa();
                              break;
                          case 10:
                              programma = false;
                              break;
                      }
                  }while (programma);

    }
    }