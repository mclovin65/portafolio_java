package conversor;

import java.util.Scanner;

public class monedas {


        public static void conversor() {
            String[] conversor_monedas = {
                    "Queztales a Dolares", "Dolares a Quetzaes",
                    "Quetzales a Pesos m", "Pesos m a Quetzales"
            };

            for (int i = 0; i < conversor_monedas.length; i++) {
                System.out.printf("[%d] %s", i + 1, conversor_monedas[i]);

                for (int j = 0; j < 19 - conversor_monedas[i].length(); j++) {
                    System.out.print(" ");
                }

                if ((i + 1) % 2 == 0) {
                    System.out.println("");
                }
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("[?]: ");
            int rScanner = scanner.nextInt();

            switch (rScanner){
                case 1:
                    System.out.print("[Q]: ");
                    double respuestaQ = scanner.nextDouble();
                    System.out.print("[$]: " + Q$(respuestaQ));
                    break;

                case 2:
                    System.out.print("[$]: ");
                    double respuesta$ = scanner.nextDouble();
                    System.out.println("[Q]: " + $Q(respuesta$));

                case 3:
                    System.out.print("[Q]: ");
                    double respuestaq = scanner.nextDouble();
                    System.out.println("[M]: " + QM(respuestaq));

                case 4:
                    System.out.print("[M]: ");
                    double respuestaM = scanner.nextDouble();
                    System.out.println("[Q]: " + MQ(respuestaM));
            }



        }

        public static double Q$(double quetzales){
            double dolares=  quetzales * (1/7.5);
            return dolares;
        }

        public static double $Q(double dolares){
            double quetzales=  dolares * (1/7.7);
            return quetzales;
        }

        public static double QM(double queztales){
            double pesosM=  queztales * (1/2.4);
            return pesosM;
        }

        public static double MQ(double pesosM){
            double queztales=  pesosM * (1/0.4);
            return queztales;
        }



    }


