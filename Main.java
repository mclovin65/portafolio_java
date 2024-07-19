import conversor.termometro;
import interfaz_grafica.Banner;
import imc.IMC;
import misMetodos.opciones;

import java.awt.*;
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
import javax.swing.*;
public class Main {
    //metodo main
    public static void main(String[] args) {
        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Celsius / faherenit", "Calcular edad",
                "convertor", "lista",
                "conversor monedas", "Opción_8",
                "escuela", "Salir"};
        JFrame miVentana = new JFrame();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setSize(600, 600);
        miVentana.setLayout(null);
        JPanel bannerr = new JPanel();
        String texto = "░▄▀▄▀▀▀▀▄▀▄░░░░░░░░░\n" +
                "░█░░░░░░░░▀▄░░░░░░▄░\n" +
                "█░░▀░░▀░░░░░▀▄▄░░█░█\n" +
                "█░▄░█▀░▄░░░░░░░▀▀░░█\n" +
                "█░░▀▀▀▀░░░░░░░░░░░░█\n" +
                "█░░░░░░░░░░░░░░░░░░█\n" +
                "█░░░░░░░░░░░░░░░░░░█\n" +
                "░█░░▄▄░░▄▄▄▄░░▄▄░░█░\n" +
                "░█░▄▀█░▄▀░░█░▄▀█░▄▀░\n" +
                "░░▀░░░▀░░░░░▀░░░▀░░░";
        JLabel label = new JLabel("<html>" + texto.replace("\n", "<br>") + "</html>");
        label.setFont(new Font("Monospaced", Font.PLAIN, 18));
        label.setBounds(10, 10, 580, 200);
        bannerr.add(label);
        bannerr.setBounds(10, 10, 580, 200);
        bannerr.setLayout(null);


        JPanel panelTexto = new JPanel();
        panelTexto.setLayout(null);
        for (int i = 1; i <= 6; i++) {
            JLabel textoPanel = new JLabel("opcion " + i, JLabel.CENTER);
            textoPanel.setBounds(100 * ((i - 1) % 2), 30 * ((i - 1) / 2), 100, 30); // Ubicación y tamaño de las etiquetas de texto
            panelTexto.add(textoPanel);
        }
        panelTexto.setBounds(10, 220, 580, 180);


        JPanel panelInferior = new JPanel();
        JLabel textoInferior = new JLabel("boton");
        textoInferior.setBounds(0, 0, 200, 30);
        panelInferior.add(textoInferior);
        panelInferior.setBounds(10, 420, 580, 30);
        panelInferior.setLayout(null);


        miVentana.add(bannerr);
        miVentana.add(panelTexto);
        miVentana.add(panelInferior);


        miVentana.setVisible(true);



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