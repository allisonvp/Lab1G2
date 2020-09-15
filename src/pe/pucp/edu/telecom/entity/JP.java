package pe.pucp.edu.telecom.entity;

import pe.pucp.edu.telecom.entity.base.Docente;
import pe.pucp.edu.telecom.entity.base.Usuario;

public class JP extends Docente {
    public int getAñoEgreso() {
        return añoEgreso;
    }

    public void setAñoEgreso(int añoEgreso) {
        this.añoEgreso = añoEgreso;
    }

    private int añoEgreso;
}
