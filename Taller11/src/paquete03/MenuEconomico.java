package paquete03;

import paquete02.Menu;

public class MenuEconomico extends Menu {

    double porcentajeDescuento;

    public MenuEconomico(String n, double vi, double vd) {
        super(n, vi);
        porcentajeDescuento = vd;
    }

    public void establecerPorcentajeDescuento(double x) {
       porcentajeDescuento = x;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial - (valorInicial * porcentajeDescuento/100);
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Economico\n%s", super.toString());
        cadena = String.format("%s"
                + "\tPorcentaje descuento: %.2f\n"
                + "\tValor Menu: %.2f\n",
                cadena,
                obtenerPorcentajeDescuento(),
                obtenerValorMenu());
        return cadena;
    }

}
