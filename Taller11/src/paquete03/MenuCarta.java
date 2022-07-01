package paquete03;
import paquete02.Menu;

public class MenuCarta extends Menu{
    
    double valorGuardicion;
    double valorBebida;
    double porcentajeAdicionalServicio;
    
    public MenuCarta(String n, double vi, double vp, double vb, 
            double vs){ super (n, vi);
        valorGuardicion = vp;
        valorBebida = vb;
        porcentajeAdicionalServicio = vs;
    }
    
    public void establecerValorGuarnicion(double x){
        valorGuardicion = x;
    }
    
    public void establecerValorBebida(double x){
        valorBebida = x;
    }
    
    public void establecerPorcentajeAdicionalServicio(double x){
        porcentajeAdicionalServicio = x;
    }
    
    @Override
    public void establecerValorMenu(){
        valorMenu = valorInicial + valorGuardicion + valorBebida + 
                ((valorInicial * porcentajeAdicionalServicio)/100);                                                                                                                                 ;
    }
    
    public double obtenerValorGuarnicion(){
        return valorGuardicion;
    }
    
    public double obtenerValorBebida(){
        return valorBebida;
    }
    
    public double obtenerPorcentajeAdicionalServicio(){
        return porcentajeAdicionalServicio;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu de carta\n%s", super.toString());
        cadena = String.format("%s"
                + "\tValor guarnicion: %.1f\n"
                + "\tValor bebida: %.1f\n"
                + "\tPorcentaje adicional: %.2f\n"
                + "\tValor total: %.2f\n",
                cadena,
                obtenerValorGuarnicion(),
                obtenerValorBebida(),
                obtenerPorcentajeAdicionalServicio(),
                obtenerValorMenu());
        return cadena;
    }
}
