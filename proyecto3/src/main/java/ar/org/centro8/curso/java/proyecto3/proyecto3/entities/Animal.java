package ar.org.centro8.curso.java.proyecto3.proyecto3.entities;

import ar.org.centro8.curso.java.proyecto3.proyecto3.enums.TipoAnimal;

public class Animal {
    private int idAnimal;
    private String nombre;
    private TipoAnimal tipoAnimal;
    private int idResponsable;
    private int idFerula;
    private int idCarrito;

    // Constructor vacío
    public Animal() {
    }

    // Constructor con todos los atributos
    public Animal(int idAnimal, String nombre, TipoAnimal tipoAnimal, int idResponsable, int idFerula, int idCarrito) {
        this.idAnimal = idAnimal;
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
        this.idResponsable = idResponsable;
        this.idFerula = idFerula;
        this.idCarrito = idCarrito;
    }

    @Override
    public String toString() {
        return "Animal [idAnimal=" + idAnimal + ", idCarrito=" + idCarrito + ", idFerula=" + idFerula
                + ", idResponsable=" + idResponsable + ", nombre=" + nombre + ", tipoAnimal=" + tipoAnimal + "]";
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    public int getIdFerula() {
        return idFerula;
    }

    public void setIdFerula(int idFerula) {
        this.idFerula = idFerula;
    }

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }



    
    

    

    
    
    
}
