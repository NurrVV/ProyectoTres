package ar.org.centro8.curso.java.proyecto3.proyecto3.entities;

public class Responsable {
    private int idResponsable;
    private String nombreResponsable;
    private String apellidoResponsable;
    private String telefonoResponsable;
    private String emailResponsable;

    // Constructor vacío
    public Responsable() {
    }

    // Constructor con todos los atributos
    public Responsable(int idResponsable, String nombreResponsable, String apellidoResponsable,
            String telefonoResponsable, String emailResponsable) {
        this.idResponsable = idResponsable;
        this.nombreResponsable = nombreResponsable;
        this.apellidoResponsable = apellidoResponsable;
        this.telefonoResponsable = telefonoResponsable;
        this.emailResponsable = emailResponsable;
    }

    @Override
    public String toString() {
        return "responsable [apellidoResponsable=" + apellidoResponsable + ", emailResponsable=" + emailResponsable
                + ", idResponsable=" + idResponsable + ", nombreResponsable=" + nombreResponsable
                + ", telefonoResponsable=" + telefonoResponsable + "]";
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getApellidoResponsable() {
        return apellidoResponsable;
    }

    public void setApellidoResponsable(String apellidoResponsable) {
        this.apellidoResponsable = apellidoResponsable;
    }

    public String getTelefonoResponsable() {
        return telefonoResponsable;
    }

    public void setTelefonoResponsable(String telefonoResponsable) {
        this.telefonoResponsable = telefonoResponsable;
    }

    public String getEmailResponsable() {
        return emailResponsable;
    }

    public void setEmailResponsable(String emailResponsable) {
        this.emailResponsable = emailResponsable;
    }

    

    
        
}
