/**
   ░░█ █▀█ █▀ █░█ █▀▀ █▀█ █▀█ █▀▄▀█
   █▄█ █▄█ ▄█ █▄█ ██▄ █▀▄ █▄█ █░▀░█
   created: 09/07/24 19:43:55
**/
import java.util.Scanner;

public class SolucionGeneralPlanDeMejoramiento {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int opcionElegida = -1;

      SolucionGeneralPlanDeMejoramiento sol = new SolucionGeneralPlanDeMejoramiento();

      do {
         System.out.println("=================================");
         System.out.println("\tMENU DE OPCIONES");
         System.out.println("=================================");
         System.out.println(" 1. Ejercicio No. 1");
         System.out.println(" 2. Ejercicio No. 2");
         System.out.println(" 3. Ejercicio No. 3");
         System.out.println(" 4. Ejercicio No. 4");
         System.out.println(" 5. Ejercicio No. 5");
         System.out.println(" 0. Salir");
         System.out.println("+++++++++++++++++++++++++++++++++");
         System.out.print("Ingrese la opcion: ");
         opcionElegida = sc.nextInt();
         System.out.println("+++++++++++++++++++++++++++++++++");

         if (opcionElegida == 0) { System.out.println("\n:: Hasta la proxima usuario X! ::\n"); }
         else if (opcionElegida == 1) sol.ejercicioNoUno(sc);
         else if (opcionElegida == 2) sol.ejercicioNoDos(sc);
         else if (opcionElegida == 3) sol.ejercicioNoTres(sc);
         else if (opcionElegida == 4) sol.ejercicioNoCuatro(sc);
         else if (opcionElegida == 5) sol.ejercicioNoCinco(sc);
         else System.out.println("\nOJO: opcion invalida, intente nuevamente.\n");
      } while(opcionElegida != 0);
   }

   public void ejercicioNoUno(Scanner sc) {
      System.out.print("Año de nacimiento del cuidadano: ");
      int añoNacimiento = sc.nextInt();
      int añoActual = 2024;

      if (añoActual - añoNacimiento < 1 || añoActual - añoNacimiento > 105) {
         System.out.println("El sistema no recibe al cuidadano debido a su año de nacimiento.");
      } else if (añoNacimiento < 2007) {
         System.out.printf("El cuidadano debe solicitar en la registraduria su cedula de cuidadania, porque tiene %d años.\n", (añoActual - añoNacimiento));
      } else {
         System.out.printf("El cuidadano aun no puede reclamar su cedula de cuidadania, porque tiene %d años.\n", (añoActual - añoNacimiento));
      }
   }

   public void ejercicioNoDos(Scanner sc) {
      System.out.print("Cuantos numeros enteros quiere ingresar: ");
      int N = sc.nextInt();
      System.out.printf("Ahora ingrese los %d numeros, separados por espacios: ", N);
      int[] datos = new int[N];
      int mayoresACero = 0, contador = 0;
      float promedioPositivos = 0, promedioTodos = 0;

      for (int i = 0; i < N; i++) {
         datos[i] = sc.nextInt();
         if (datos[i] > 0) {
            mayoresACero++;
         }
         if (datos[i] >= 0) {
            promedioPositivos += (float) datos[i];
            contador++;
         }
         promedioTodos += (float) datos[i];
      }

      System.out.printf("\nHubieron %d numeros mayores a cero.\n", mayoresACero);
      System.out.println("El promedio de los numeros positivos es = " + (promedioPositivos / contador));
      System.out.println("El promedio de todos los numeros es = " + (promedioTodos / N));
   }

   public void ejercicioNoTres(Scanner sc) {
      while (true) {
         System.out.println("\n| MODELO\t| DESCUENTO\t|");
         System.out.println("---------------------------------");
         System.out.println("| Blazer-Trail\t| 8%\t\t|");
         System.out.println("| Cavalier\t| 5%\t\t|");
         System.out.println("| Chevy  \t| 6%\t\t|");
         System.out.println("| Opel-Astra\t| 9%\t\t|");
         System.out.println("---------------------------------");

         System.out.print("Modelo del vehiculo: ");
         String modeloVehiculo = sc.next();
         System.out.print("Precio del vehiculo: ");
         int precioVehiculo = sc.nextInt();
         double descuento = 0;

         if (modeloVehiculo.equalsIgnoreCase("blazer-trail")) {
            descuento = precioVehiculo * 0.08;
            System.out.printf("\nEl precio del vehiculo modelo Blazer-Trail es de $%d.\nCon el descuento del 8% le queda en $%d.", precioVehiculo, (precioVehiculo - (int) descuento));
         } else if (modeloVehiculo.equalsIgnoreCase("cavalier")) {
            descuento = precioVehiculo * 0.05;
            System.out.printf("\nEl precio del vehiculo modelo Cavalier es de $%d.\nCon el descuento del 5% le queda en $%d.", precioVehiculo, (precioVehiculo - (int) descuento));
         } else if (modeloVehiculo.equalsIgnoreCase("chevy")) {
            descuento = precioVehiculo * 0.06;
            System.out.printf("\nEl precio del vehiculo modelo Chevy es de $%d.\nCon el descuento del 6% le queda en $%d.", precioVehiculo, (precioVehiculo - (int) descuento));
         } else if (modeloVehiculo.equalsIgnoreCase("opel-astra")) {
            descuento = precioVehiculo * 0.09;
            System.out.printf("\nEl precio del vehiculo modelo Opel-Astra es de $%d.\nCon el descuento del 9 porciento le queda en $%d.", precioVehiculo, (precioVehiculo - (int) descuento));
         } else {
            System.out.print("OJO: no existe ningun vehiculo con ese modelo.");
         }
         
         System.out.print("\n\nDesea continuar contizando (si / no)? ");
         String respuesta = sc.next();
         if (respuesta.equalsIgnoreCase("no")) {
            break;
         }
      }
   }

   public void ejercicioNoCuatro(Scanner sc) {
      int cantidadPrestamosAprobados = 0;
      System.out.println("Hola! a continuacion comprobaremos si usted es acto para recibir el prestamo del Banco.");

      while (true) {
         System.out.print("\nDe cuanto es el ingreso anual: ");
         int ingresoAnual = sc.nextInt();
         System.out.print("Cuantos hijos tiene: ");
         int cantidadHijos = sc.nextInt();

         if ((ingresoAnual >= 20000000 && ingresoAnual <= 24000000 && cantidadHijos == 0) ||
            (ingresoAnual > 25000000 && ingresoAnual < 40000000 && cantidadHijos <= 2) ||
            (ingresoAnual > 40000000)) {
            System.out.println("\nFelicidades! su prestamo ha sido aprobado porque cumple con los requisitos.");
            cantidadPrestamosAprobados++;
         } else {
            System.out.println("\nLamentablemente, usted no cumple con los requisitos para el prestamo.");
         }

         System.out.print("\nQuiere consultar a otro cliente (si / no)? ");
         String respuesta = sc.next();
         if (respuesta.equalsIgnoreCase("no")) {
            break;
         }
      }
      System.out.printf("\nEn total hubieron %d prestamos concedidos.\n", cantidadPrestamosAprobados);
   }

   public void ejercicioNoCinco(Scanner sc) {
      // Ingeniero Alex Martinex, mañana termino la solución 
      String[] platos = new String[7];
      int[] precios = new int[7];
      for (int i = 0; i < 7; i++) {
         System.out.printf("Nombre del plato %d: ", (i + 1));
         platos[i] = sc.nextLine().toLowerCase();
         System.out.printf("Precio del plato %d: ", (i + 1));
         precios[i] = sc.nextInt();
      }
   }
}