
package Model;

public class Arriendo {
 private int numArriendo;
 private String fecArr;
 private int diasArriendo;
 private Cliente cli;
 private Vehiculo veh;
 public static int contador = 0;

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Vehiculo getVeh() {
        return veh;
    }

    public void setVeh(Vehiculo veh) {
        this.veh = veh;
    }

    public Arriendo(String fecArr, int diasArriendo,Cliente cli,Vehiculo veh ) { 
        this.numArriendo = contador++;
        this.fecArr = fecArr;
        this.diasArriendo = diasArriendo;
        this.cli = cli;
        this.veh = veh;
    }

    public int getNumArriendo() {
        return numArriendo;
    }

    public void setNumArriendo(int numArriendo) {
        this.numArriendo = numArriendo;
    }

    public String getFecArr() {
        return fecArr;
    }

    public void setFecArr(String fecArr) {
        this.fecArr = fecArr;
    }

    public int getDiasArriendo() {
        return diasArriendo;
    }

    public void setDiasArriendo(int diasArriendo) {
        this.diasArriendo = diasArriendo;
    }

    @Override
    public String toString() {
        return "Arriendo{" + "numArriendo=" + getNumArriendo() + ", fecArr=" + getFecArr() + ", diasArriendo=" + getDiasArriendo() + '}';
    }

public void Arriendo(int numA,String fec, int dias){
}
public int obtenerMontoApagar(int precioDia){
    int monto = this.diasArriendo*precioDia;
    return  monto;
}
public boolean evaluarArriendo(){
return this.cli.isVigente() == true && Character.compare(this.veh.getCondicion(), 'D')==0;
}
public void msj(String msj){
    System.out.println(msj);
}

}
