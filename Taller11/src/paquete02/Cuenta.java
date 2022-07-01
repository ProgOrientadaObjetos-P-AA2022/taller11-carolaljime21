package paquete02;

import java.util.ArrayList;

public class Cuenta {

    String nombre;
    ArrayList<Menu> listaMenu = new ArrayList<>();
    double valorCancelar;
    double subTotal;
    double iva;

    public Cuenta(String n, double iv, ArrayList<Menu> m) {
        nombre = n;
        iva = iv;
        listaMenu = m;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerListaMenu(ArrayList<Menu> x) {
        listaMenu = x;
    }
    
    public void establecerSubTotal(){
        double sum = 0;
        for (int i = 0; i < listaMenu.size(); i++) {
            sum = sum + listaMenu.get(i).obtenerValorMenu();
        }
        subTotal = sum;
    }
    
    public void establecerIVA(double x) {
        iva = x;
    }

    public void establecerValorCancelar() {
        valorCancelar = subTotal + (subTotal * iva)/100;
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
        String cadena = String.format("Factura\n"
                + "Cliente: %s\n", obtenerNombre());
        
        for (int i = 0; i < obtenerListaMenu().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n", 
                    cadena,
                    obtenerListaMenu().get(i));

        }
        cadena=String.format("\n%s"
                + "Subtotal: %.1f\n"
                + "Iva: %.2f\n"
                + "Total a pagar: %.3f\n",
                cadena,
                obtenerSubTotal(),
                obtenerIVA(),
                obtenerValorCancelar());
        return cadena;
    }
}
