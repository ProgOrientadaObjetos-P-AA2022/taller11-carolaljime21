package paquete02;

import java.util.ArrayList;

public class Cuenta {

    String nombre;
    ArrayList<Menu> listaMenu = new ArrayList<>();
    double valorCancelar;
    double subTotal;
    double iva;

    public Cuenta(String n, double iva, ArrayList<Menu> m) {
        nombre = n;
        iva = iva;
        listaMenu = m;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerIVA(double x) {
        iva = x;
    }

    public void establecerListaMenu(ArrayList<Menu> x) {
        listaMenu = x;
    }
    
    public void establecerSubTotal(){
        double sum = 0;
        for (int i = 0; i < listaMenu.size(); i++) {
            sum = sum + listaMenu.get(i).obtenerValorMenu();
        }
        subTotal = sum * iva;
    }

    public void establecerValorCancelar() {
        double sum = 0;
        for (int i = 0; i < listaMenu.size(); i++) {
            sum = sum + listaMenu.get(i).obtenerValorMenu();
        }
        
        valorCancelar = obtenerSubTotal() + sum;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerIVA() {
        return iva;
    }

    public ArrayList<Menu> obtenerListaMenu() {
        return listaMenu;
    }
    
    public double obtenerSubTotal(){
        return subTotal;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Datos Cuenta\n"
                + "Cliente: :%s\n", obtenerNombre());
        for (int i = 0; i < obtenerListaMenu().size(); i++) {
            cadena = String.format("%s"
                    + "%d "
                    + "%s\n", 
                    cadena,
                    (i+1),
                    obtenerListaMenu().get(i));

        }
        cadena=String.format("\n%s"
                + "Subtotal: %.2f\n"
                + "Iva: %.2f\n"
                + "Total a cancelar: %.2f\n",
                cadena,
                obtenerSubTotal(),
                obtenerIVA(),
                obtenerValorCancelar());
        return cadena;
    }
}
