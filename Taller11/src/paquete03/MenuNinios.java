package paquete03;
import paquete02.Menu;

public class MenuNinios extends Menu {
    
    double valorPorcionHelado;
    double valorPorcionPastel;
    
    public MenuNinios(String n, double vi, double vh, double vp){ 
        super (n, vi);
        valorPorcionHelado = vp;
        valorPorcionPastel = vp;
    }
    
    public void establecerValorPorcionHelado(double x){
        valorPorcionHelado = x;
    }
    
    public void establecerValorPorcionPastel(double x){
        valorPorcionPastel = x;
    }
    
    @Override
    public void establecerValorMenu(){
        valorMenu = valorInicial + valorPorcionHelado + valorPorcionPastel;
    }
    
    public double obtenerValorPorcionHelado(){
        return valorPorcionHelado;
    }
    
    public double obtenerValorPorcionPastel(){
        return valorPorcionPastel;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu de niños\n%s", super.toString());
        cadena = String.format("%s"
                + "Porción de helado: %.2f\n"
                + "Porcion de pastel: %.2f\n"
                + "Valor total: %.2f\n",
                cadena,
                obtenerValorPorcionHelado(),
                obtenerValorPorcionPastel(),
                obtenerValorMenu());
        return cadena;
    }
    
}
