package paquete01;

import java.util.ArrayList;
import paquete03.*;
import paquete02.*;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Menu> listaMenu = new ArrayList<>();

        MenuNinios menuNi1 = new MenuNinios("Niños 01", 2.00, 1.00, 1.50);
        menuNi1.establecerValorMenu();
        
        MenuNinios menuNi2 = new MenuNinios("Niños 02", 3.00, 1.00, 1.50);
        menuNi2.establecerValorMenu();
        
        MenuEconomico economico = new MenuEconomico("Econo 001", 4.00, 25);
        economico.establecerValorMenu();
        
        MenuDia dia = new MenuDia("Dia 001", 5.00, 1.00, 1.00);
        dia.establecerValorMenu();

        MenuCarta carta = new MenuCarta("Carta 001", 6.0, 1.5, 2.0, 10);
        carta.establecerValorMenu();
        
        listaMenu.add(menuNi1);
        listaMenu.add(menuNi2);
        listaMenu.add(economico);
        listaMenu.add(dia);
        listaMenu.add(carta);
        
        Cuenta cliente = new Cuenta("Carolina Alvarado", 10.0, listaMenu);
        cliente.establecerSubTotal();
        cliente.establecerValorCancelar();
        System.out.printf("%s\n", cliente);

    }
}
