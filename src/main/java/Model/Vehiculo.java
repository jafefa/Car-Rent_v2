
package Model;

public class Vehiculo {
    
    private String patente;
    private char condicion;  

    public Vehiculo(String patente) {
        this.patente = patente;
        this.condicion = 'D';
    }
    
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public char getCondicion() {
        return condicion;
    }

    public void setCondicion(char condicion) {
        this.condicion = condicion;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", condicion=" + condicion + '}';
    }
    

}
