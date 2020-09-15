package pe.pucp.edu.telecom.main;

import pe.pucp.edu.telecom.entity.base.Usuario;
import pe.pucp.edu.telecom.manager.CSV;
import pe.pucp.edu.telecom.manager.DirectorioTelefonico;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        DirectorioTelefonico dt = new DirectorioTelefonico();
        //CSV csv =  new CSV();
        ArrayList<Usuario> listaEncontrados = new ArrayList<>();
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
                        dt.listarUsuarios();
                        break;

                    case 2:
                        dt.agregar();
                        break;

                    case 3:
                        System.out.print("Ingresa nombre o apellido a buscar: ");
                        String buscarNomApe = sc.nextLine();
                        sc.close();

                        ArrayList<Usuario> usuarios =dt.getListaUsuarios();

                        for (int i=0; i<usuarios.size(); i++){
                            if (usuarios.get(i).getNombre().equals(buscarNomApe) || usuarios.get(i).getApellido().equals(buscarNomApe) ) {
                                listaEncontrados.add(usuarios.get(i));

                            }else {
                                System.out.println("El usuario no existe");
                            }
                        }
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
                System.out.println("Opción errónea");
            }
        }
    }
}
