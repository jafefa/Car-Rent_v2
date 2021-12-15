
package Clientes;
import Model.ArriendoCuota;
import Model.Cliente;
import Model.Vehiculo;

public class main {
      public static void main(String[] args){
      Cliente cli = new Cliente("153654255","Javier");
      Vehiculo veh = new Vehiculo("ljhd54");
      ArriendoCuota arr = new ArriendoCuota(6,1,"12-12-2021",2,cli,veh);
      arr.ingresarArriendoConCuota(1000);
          System.out.println(arr.toString());
          System.out.println(arr.getCli().toString()+","+arr.getVeh().toString());
      arr.pagarCuota(0);
          System.out.println(arr.toString());
      

  }
}
