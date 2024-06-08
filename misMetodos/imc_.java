package misMetodos;
import java.util.Scanner;
public class imc_{

        public static void terminal(){
            Scanner sc = new Scanner(System.in);

            double peso,estatura;
            System.out.println(" peso kg: ");
            peso = sc.nextDouble();
            System.out.println(" Estatura metros: ");
            estatura = sc.nextDouble();

            System.out.println("su nivel de peso es:"+ nivelpeso(calcularimc(peso,estatura)));


        }
        public static double calcularimc(double peso, double estatura){
            return peso/Math.pow(estatura,2);
        }
        public static String nivelpeso(double IMC ){ {
            if (IMC < 18.5) {
                return "bajo peso";
            } else if (IMC >= 18.5 && IMC <= 24.9) {
                return "peso normal";
            } else if (IMC >= 25 && IMC <= 29.9) {
                return "sobre peso";
            } else if (IMC >= 30 && IMC <= 34.9) {
                return "obesidad I";
            } else if (IMC >= 35 && IMC <= 39.9) {
                return "obesidad II";
            } else if (IMC >= 40) {
                return "obesidad III";
            } else  {
                return "obesidad IV";
            }
        }

        }

    }






