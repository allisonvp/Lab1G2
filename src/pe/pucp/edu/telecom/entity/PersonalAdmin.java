package pe.pucp.edu.telecom.entity;

import pe.pucp.edu.telecom.entity.base.Usuario;

public class PersonalAdmin extends Usuario {
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
