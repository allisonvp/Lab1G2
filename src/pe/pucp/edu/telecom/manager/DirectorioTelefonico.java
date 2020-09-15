package pe.pucp.edu.telecom.manager;

import pe.pucp.edu.telecom.entity.base.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class DirectorioTelefonico {

    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    Usuario usuario = new Usuario();
    Scanner sc = new Scanner(System.in);

    public void agregar() {
        Usuario usuario = Usuario.datosUsuario();
        listaUsuarios.add(usuario);

        System.out.print("¿Es docente o personal administrativo?: ");
        String rpta = sc.nextLine();
        if (rpta.equalsIgnoreCase("docente")) {

        } else if (rpta.equalsIgnoreCase("docente")) {

        } else {

        }
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}
