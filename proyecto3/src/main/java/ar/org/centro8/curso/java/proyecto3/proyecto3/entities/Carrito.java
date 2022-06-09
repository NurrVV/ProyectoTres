package ar.org.centro8.curso.java.proyecto3.proyecto3.entities;

public class Carrito {
    private int idCarrito;
    private double altoGeneral;
    private double anchoGeneral;
    private double profundidadGeneral;
    private String miembrosFaltantes;
    private double medidaMunonDelanteroDerecho;
    private double diametroMunonDelanteroDerecho;
    private double medidaMunonDelanteroIzquierdo;
    private double diametroMunonDelanteroIzquierdo;
    private double medidaMunonTraseroDerecho;
    private double diametroMunonTraseroDerecho;
    private double medidaMunonTraseroIzquierdo;
    private double diametroMunonTraseroIzquierdo;
    private String descripcionExtra;

    
    // Constructor vacío
    public Carrito() {
    }

    // Constructor con todos los atributos
    public Carrito(int idCarrito, double altoGeneral, double anchoGeneral, double profundidadGeneral,
            String miembrosFaltantes, double medidaMunonDelanteroDerecho, double diametroMunonDelanteroDerecho,
            double medidaMunonDelanteroIzquierdo, double diametroMunonDelanteroIzquierdo,
            double medidaMunonTraseroDerecho, double diametroMunonTraseroDerecho, double medidaMunonTraseroIzquierdo,
            double diametroMunonTraseroIzquierdo, String descripcionExtra) {
        this.idCarrito = idCarrito;
        this.altoGeneral = altoGeneral;
        this.anchoGeneral = anchoGeneral;
        this.profundidadGeneral = profundidadGeneral;
        this.miembrosFaltantes = miembrosFaltantes;
        this.medidaMunonDelanteroDerecho = medidaMunonDelanteroDerecho;
        this.diametroMunonDelanteroDerecho = diametroMunonDelanteroDerecho;
        this.medidaMunonDelanteroIzquierdo = medidaMunonDelanteroIzquierdo;
        this.diametroMunonDelanteroIzquierdo = diametroMunonDelanteroIzquierdo;
        this.medidaMunonTraseroDerecho = medidaMunonTraseroDerecho;
        this.diametroMunonTraseroDerecho = diametroMunonTraseroDerecho;
        this.medidaMunonTraseroIzquierdo = medidaMunonTraseroIzquierdo;
        this.diametroMunonTraseroIzquierdo = diametroMunonTraseroIzquierdo;
        this.descripcionExtra = descripcionExtra;

        
    }

    @Override
    public String toString() {
        return "carrito [altoGeneral=" + altoGeneral + ", anchoGeneral=" + anchoGeneral + ", descripcionExtra="
                + descripcionExtra + ", diametroMunonDelanteroDerecho=" + diametroMunonDelanteroDerecho
                + ", diametroMunonDelanteroIzquierdo=" + diametroMunonDelanteroIzquierdo
                + ", diametroMunonTraseroDerecho=" + diametroMunonTraseroDerecho + ", diametroMunonTraseroIzquierdo="
                + diametroMunonTraseroIzquierdo + ", idCarrito=" + idCarrito + ", medidaMunonDelanteroDerecho="
                + medidaMunonDelanteroDerecho + ", medidaMunonDelanteroIzquierdo=" + medidaMunonDelanteroIzquierdo
                + ", medidaMunonTraseroDerecho=" + medidaMunonTraseroDerecho + ", medidaMunonTraseroIzquierdo="
                + medidaMunonTraseroIzquierdo + ", miembrosFaltantes=" + miembrosFaltantes + ", profundidadGeneral="
                + profundidadGeneral + "]";
    }

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public double getAltoGeneral() {
        return altoGeneral;
    }

    public void setAltoGeneral(double altoGeneral) {
        this.altoGeneral = altoGeneral;
    }

    public double getAnchoGeneral() {
        return anchoGeneral;
    }

    public void setAnchoGeneral(double anchoGeneral) {
        this.anchoGeneral = anchoGeneral;
    }

    public double getProfundidadGeneral() {
        return profundidadGeneral;
    }

    public void setProfundidadGeneral(double profundidadGeneral) {
        this.profundidadGeneral = profundidadGeneral;
    }

    public String getMiembrosFaltantes() {
        return miembrosFaltantes;
    }

    public void setMiembrosFaltantes(String miembrosFaltantes) {
        this.miembrosFaltantes = miembrosFaltantes;
    }

    public double getMedidaMunonDelanteroDerecho() {
        return medidaMunonDelanteroDerecho;
    }

    public void setMedidaMunonDelanteroDerecho(double medidaMunonDelanteroDerecho) {
        this.medidaMunonDelanteroDerecho = medidaMunonDelanteroDerecho;
    }

    public double getDiametroMunonDelanteroDerecho() {
        return diametroMunonDelanteroDerecho;
    }

    public void setDiametroMunonDelanteroDerecho(double diametroMunonDelanteroDerecho) {
        this.diametroMunonDelanteroDerecho = diametroMunonDelanteroDerecho;
    }

    public double getMedidaMunonDelanteroIzquierdo() {
        return medidaMunonDelanteroIzquierdo;
    }

    public void setMedidaMunonDelanteroIzquierdo(double medidaMunonDelanteroIzquierdo) {
        this.medidaMunonDelanteroIzquierdo = medidaMunonDelanteroIzquierdo;
    }

    public double getDiametroMunonDelanteroIzquierdo() {
        return diametroMunonDelanteroIzquierdo;
    }

    public void setDiametroMunonDelanteroIzquierdo(double diametroMunonDelanteroIzquierdo) {
        this.diametroMunonDelanteroIzquierdo = diametroMunonDelanteroIzquierdo;
    }

    public double getMedidaMunonTraseroDerecho() {
        return medidaMunonTraseroDerecho;
    }

    public void setMedidaMunonTraseroDerecho(double medidaMunonTraseroDerecho) {
        this.medidaMunonTraseroDerecho = medidaMunonTraseroDerecho;
    }

    public double getDiametroMunonTraseroDerecho() {
        return diametroMunonTraseroDerecho;
    }

    public void setDiametroMunonTraseroDerecho(double diametroMunonTraseroDerecho) {
        this.diametroMunonTraseroDerecho = diametroMunonTraseroDerecho;
    }

    public double getMedidaMunonTraseroIzquierdo() {
        return medidaMunonTraseroIzquierdo;
    }

    public void setMedidaMunonTraseroIzquierdo(double medidaMunonTraseroIzquierdo) {
        this.medidaMunonTraseroIzquierdo = medidaMunonTraseroIzquierdo;
    }

    public double getDiametroMunonTraseroIzquierdo() {
        return diametroMunonTraseroIzquierdo;
    }

    public void setDiametroMunonTraseroIzquierdo(double diametroMunonTraseroIzquierdo) {
        this.diametroMunonTraseroIzquierdo = diametroMunonTraseroIzquierdo;
    }

    public String getDescripcionExtra() {
        return descripcionExtra;
    }

    public void setDescripcionExtra(String descripcionExtra) {
        this.descripcionExtra = descripcionExtra;
    }


    



    

}
