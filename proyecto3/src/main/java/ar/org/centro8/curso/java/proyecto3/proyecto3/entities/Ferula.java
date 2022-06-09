package ar.org.centro8.curso.java.proyecto3.proyecto3.entities;

import ar.org.centro8.curso.java.proyecto3.proyecto3.enums.MiembroProtesis;
import ar.org.centro8.curso.java.proyecto3.proyecto3.enums.TipoFerula;

public class Ferula {
    private int idFerula;
    private TipoFerula tipoFerula;
    private MiembroProtesis miembroProtesis;
    private double alto;
    private double ancho;
    private double profundidad;

    //Constructor vacío
    public Ferula() {
    }

    // Constructor con todos los atributos
    public Ferula(int idFerula, TipoFerula tipoFerula, MiembroProtesis miembroProtesis, double alto, double ancho,
            double profundidad) {
        this.idFerula = idFerula;
        this.tipoFerula = tipoFerula;
        this.miembroProtesis = miembroProtesis;
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    @Override
    public String toString() {
        return "ferula [alto=" + alto + ", ancho=" + ancho + ", idFerula=" + idFerula + ", miembroProtesis="
                + miembroProtesis + ", profundidad=" + profundidad + ", tipoFerula=" + tipoFerula + "]";
    }

    public int getIdFerula() {
        return idFerula;
    }

    public void setIdFerula(int idFerula) {
        this.idFerula = idFerula;
    }

    public TipoFerula getTipoFerula() {
        return tipoFerula;
    }

    public void setTipoFerula(TipoFerula tipoFerula) {
        this.tipoFerula = tipoFerula;
    }

    public MiembroProtesis getMiembroProtesis() {
        return miembroProtesis;
    }

    public void setMiembroProtesis(MiembroProtesis miembroProtesis) {
        this.miembroProtesis = miembroProtesis;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    
    
    
}
