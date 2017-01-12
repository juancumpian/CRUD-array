//El programa debe ser capaz de dar de alta, listar, modificar, editar y borrar elementos.
import java.util.Scanner;

public class EjercicioCrudArray{

  static Scanner teclado = new Scanner (System.in);
  static int[] id = new int[10];
  static String[] nombre = new String[10];
  static int[] precio = new int[10];
  static String[] fabricante = new String[10];

 private static void crearArrays(){

  for(int i = 0; i < id.length; i++){
      id[i] = -1;
  }

  id[0] = 1;
  id[1] = 2;
  id[2] = 3;
  id[3] = 4;
  id[4] = 5;
  nombre[0] = "nombre0";
  nombre[1] = "nombre1";
  nombre[2] = "nombre2";
  nombre[3] = "nombre3";
  nombre[4] = "nombre4";
  precio[0] = 0;
  precio[1] = 1;
  precio[2] = 2;
  precio[3] = 3;
  precio[4] = 4;
  fabricante[0] = "nombre0";
  fabricante[1] = "nombre1";
  fabricante[2] = "nombre2";
  fabricante[3] = "nombre3";
  fabricante[4] = "nombre4";
 }

  public static void main(String[] args){

    crearArrays();
    menu();

  }
  private static void menu(){

     int opcion;
     do{
     System.out.println("elija en el siguiente menu segun las opciones: ");
     System.out.println("1.alta");
     System.out.println("2.listar");
     System.out.println("3.modificar");
     System.out.println("4.borrar");
     System.out.println("0.salir");
     opcion = teclado.nextInt();
     teclado.nextLine();


      switch(opcion){
        case 1:

           alta();

        break;
        case 2:

           listar();

        break;
        case 3:

           modificar();

        break;
        case 4:

           borrar();

        break;

      }
   }while(opcion > 0 && opcion < 5);

  }

  private static void alta(){

    String nombreL;
    String fabricanteL;
    int precioL;
    int obtenerPosicion = 1;

    for(int i = 0; i < id.length; i++){
      if(id[i] != -1){
        obtenerPosicion++;
      }
    }

    System.out.println("has elejido anadir un nuevo elemnto a la tienda");

    System.out.println("dime el nombre");
    nombreL = teclado.nextLine();

    System.out.println("dime el precio");
    precioL = teclado.nextInt();

    teclado.nextLine();

    System.out.println("dime el fabricante");
    fabricanteL = teclado.nextLine();

    id[obtenerPosicion] = obtenerPosicion;
    nombre[obtenerPosicion] = nombreL;
    fabricante[obtenerPosicion] = fabricanteL;
    precio[obtenerPosicion] = precioL;

  }
  private static void listar(){

    System.out.println("id-----nombre-----fabricante-----precio");

    for (int i = 0; i < id.length; i++) {
      if(id[i] != -1){

        System.out.println(id[i]+"------"+nombre[i]+"----"+fabricante[i]+"--------"+precio[i]);

      }
    }
  }
  private static void modificar(){

     

  }
  private static void borrar(){

  }

}
