package paquete03;
import paquete02.Menu;

public class MenuDia extends Menu {
    
    double valorPostre;
    double valorBebida;
    
    public MenuDia(String n, double vi, double vp, double vb){ 
        super (n, vi);
        valorPostre = vp;
        valorBebida = vb;
    }
    
    public void establecerValorPostre(double x){
        valorPostre = x;
    }
    
    public void establecerValorBebida(double x){
        valorBebida = x;
    }
    
    @Override
    public void establecerValorMenu(){
        valorMenu = valorInicial + valorPostre + valorBebida;
    }
    
    public double obtenerValorPostre(){
        return valorPostre;
    }
    
    public double obtenerValorBebida(){
        return valorBebida;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu del dia\n%s", super.toString());
        cadena = String.format("%s"
                + "Valor del postre: %.2f\n"
                + "Valor de la bebida: %.2f\n"
                + "Valor total: %.2f\n",
                cadena,
                obtenerValorPostre(),
                obtenerValorBebida(),
                obtenerValorMenu());
        return cadena;
    }
    
}
