
package Model;
import java.util.ArrayList;
public class ArriendoCuota extends Arriendo{
    private int cantCuotas;
    private ArrayList<CuotaArriendo> arrCuota;
    
    //constructor
    public ArriendoCuota(int cantCuotas, String fecArr, int diasArriendo,Cliente cli,Vehiculo veh ) {
        super( fecArr, diasArriendo, cli, veh);
        this.arrCuota = new ArrayList();
        this.cantCuotas = cantCuotas;
    }
    
    
    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    @Override
    public String toString() {
        return "ArriendoCuota{" + "cantCuotas=" + cantCuotas + ", arrCuota=" + arrCuota + '}';
    }

  
    
    public boolean ingresarArriendoConCuota(int precioDia){
        if(this.evaluarArriendo()){
            this.getVeh().setCondicion('A');
            generaCuotas( this.obtenerMontoApagar(precioDia));        
            return true;
        }
        return false;
    }
    public ArrayList<CuotaArriendo> generaCuotas(int montoaPagar){
        int valorCuota = montoaPagar/cantCuotas;

        for(int i=0;i<this.cantCuotas;i++){
            var cuota = new CuotaArriendo(i,valorCuota);
            this.arrCuota.add(cuota);
            
            }
        return this.arrCuota;
    }
    public boolean pagarCuota(int cuota){
        
        for (CuotaArriendo arrCuota1 : this.arrCuota) {
            if (arrCuota1.getNumCuota() == cuota) {
                arrCuota1.setPagada(true);
                return true;
            }
        }
        return false;
    }
    


}
