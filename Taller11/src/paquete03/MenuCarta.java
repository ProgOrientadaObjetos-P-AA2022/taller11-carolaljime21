package paquete03;
import paquete02.Menu;

public class MenuCarta extends Menu{
    
    double valorPorcion;
    double valorBebida;
    double valorServicio;
    
    public MenuCarta(String n, double vi, double vp, double vb, 
            double vs){ super (n, vi);
        valorPorcion = vp;
        valorBebida = vb;
        valorServicio = vs;
    }
    
    public void establecerValorPorcion(double x){
        valorPorcion = x;
    }
    
    public void establecerValorBebida(double x){
        valorBebida = x;
    }
    
    public void establecerValorServicio(double x){
        valorServicio = x;
    }
    
    @Override
    public void establecerValorMenu(){
        valorMenu = valorInicial + valorPorcion + valorBebida + valorServicio;
    }
    
    public double obtenerValorPorcion(){
        return valorPorcion;
    }
    
    public double obtenerValorBebida(){
        return valorBebida;
    }
    
    public double obtenerValorServicio(){
        return valorServicio;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu de carta\n%s", super.toString());
        cadena = String.format("%s"
                + "Valor porcion: %.2f\n"
                + "Porcion bebida: %.2f\n"
                + "Valor servicio: %.2f\n"
                + "Valor total: %.2f\n",
                cadena,
                obtenerValorPorcion(),
                obtenerValorBebida(),
                obtenerValorServicio(),
                obtenerValorMenu());
        return cadena;
    }
}
