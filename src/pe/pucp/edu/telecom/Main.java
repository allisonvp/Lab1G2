package pe.pucp.edu.telecom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        principal:
        while(true) {
            try {
                System.out.println("\n1. Leer Datos");
                System.out.println("2. Agregar Usuario");
                System.out.println("3. Buscar Usuario");
                System.out.println("4. Escribir Directorio");
                System.out.println("5. Cerrar aplicación");
                System.out.print("Seleccione su opción: ");
                int opcion = Integer.valueOf(sc.nextLine());

                switch (opcion) {
                    case 1:
                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    case 5:
                        sc.close();
                        break principal;

                    default:
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("¡Debe ingresar un número!");
            }
        }
    }
}
