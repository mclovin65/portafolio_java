package lista;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import misMetodos.opciones;

public class listaDeCompras {

    public static String []opciones6= {"lista de compras","salir"};

    public static void programa(){
      opciones.cargaropciones(opciones6);
      Scanner sc = new Scanner(System.in);
      System.out.print("[?]");
      int opcion = sc.nextInt();

      switch (opcion){
          case 1:
       crearLista();
          break;
          case 2:
              System.out.print("salir");
              break;
      }
    }

 public static void crearLista(){
        List<String> lista= new ArrayList<>();
        List<Double> lista2= new ArrayList<>();


      String producto;
      double precio;

        for (int i =1;i<=3;i++){
            Scanner item = new Scanner(System.in);
            System.out.print("Ingrese el nombre de un producto: ");
            producto = item.nextLine();

            System.out.print("precio");
            precio= item.nextDouble();
            lista.add(producto);
            lista2.add(precio);


        }



        System.out.print(lista+"-->"+lista2);


    }


}
