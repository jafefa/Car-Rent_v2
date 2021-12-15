
package Model;

public class Cliente {
 private String cedula;
 private String nombre;
 private boolean vigente;

    public Cliente(String cedula, String nombre) {
        this.setCedula(cedula);
        this.nombre = nombre;
        this.vigente = true;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if(validaRut(formatearRut(cedula))){
        this.cedula = formatearRut(cedula);
        }else{
        this.cedula = "";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVigente() {
        return vigente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", vigente=" + vigente + '}';
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }
    private boolean validaRut(String rut){
        int suma=0;
        String dvR,dvT;
        int[] serie = {2,3,4,5,6,7};
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        dvR = rut.substring(rut.length()-1);
        for(int i = rut.length()-2;i>=0; i--){
            suma +=  Integer.valueOf(rut.substring(i, i+1))
                    *serie[(rut.length()-2-i)%6];
        }
        dvT=String.valueOf(11-suma%11);
        if(dvT.compareToIgnoreCase("10") == 0){
            dvT = "K";
        }

        if(dvT.compareToIgnoreCase(dvR) == 0){
            return true;
        } else {
            System.out.print("Rut ingresado invalido");
            return false;
        }
    }
    public String formatearRut(String rut){
        int cont=0;
        String format;
        if(rut.length() == 0){
            return "";
        }else{
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            format = "-"+rut.substring(rut.length()-1);
            for(int i = rut.length()-2;i>=0;i--){
                format = rut.substring(i, i+1)+format;
                cont++;
                if(cont == 3 && i != 0){
                    format = "."+format;
                    cont = 0;
                }
            }
            return format;
        }
    }
}
