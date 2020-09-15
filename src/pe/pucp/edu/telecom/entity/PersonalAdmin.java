package pe.pucp.edu.telecom.entity;

import pe.pucp.edu.telecom.entity.base.Docente;
import pe.pucp.edu.telecom.entity.base.Usuario;

import java.util.Scanner;

public class PersonalAdmin extends Usuario {
    private String cargo;

    public static PersonalAdmin datosPersonalAdmin() {
        Scanner sc = new Scanner(System.in);
        PersonalAdmin personalAdmin = new PersonalAdmin();

        System.out.print("Ingrese el cargo que desempeña: ");
        personalAdmin.setCargo(sc.nextLine());

        return personalAdmin;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
