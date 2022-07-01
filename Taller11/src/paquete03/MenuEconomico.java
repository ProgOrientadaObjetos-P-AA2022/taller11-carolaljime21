package paquete03;

import paquete02.Menu;

public class MenuEconomico extends Menu {

    double valorDescuento;

    public MenuEconomico(String n, double vi, double vd) {
        super(n, vi);
        valorDescuento = vd;
    }

    public void establecerValorDescuento(double x) {
        valorDescuento = x;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial - (valorInicial * valorDescuento);
    }

    public double obtenerValorDescuento() {
        return valorDescuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Economico\n%s", super.toString());
        cadena = String.format("%s"
                + "Valor descuento: %.2f\n"
                + "Valor Menu: %.2f\n",
                cadena,
                obtenerValorDescuento(),
                obtenerValorMenu());
        return cadena;
    }

}
