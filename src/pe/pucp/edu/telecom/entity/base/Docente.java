package pe.pucp.edu.telecom.entity.base;

public class Docente extends Usuario {
    public int añoInicioAct;
    public int cantCursos;



    public int getAñoInicioAct() {
        return añoInicioAct;
    }

    public void setAñoInicioAct(int añoInicioAct) {
        this.añoInicioAct = añoInicioAct;
    }

    public int getCantCursos() {
        return cantCursos;
    }

    public void setCantCursos(int cantCursos) {
        this.cantCursos = cantCursos;
    }
}
