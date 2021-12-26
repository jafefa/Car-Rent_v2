
package Controller;

import Model.Cliente;
import java.util.ArrayList;

public class ControladorAgregarCliente {
        public static ArrayList<String> listaNombres = new ArrayList<>();
        public static ArrayList<Cliente> listaClientes = new ArrayList<>();

   
    
public static void agregarCliente(String nombre, String ced, Boolean vig){
    Cliente cli = new Cliente(ced,nombre);
    listaNombres.add(cli.getNombre()); 
    listaClientes.add(cli);
    
}
}
