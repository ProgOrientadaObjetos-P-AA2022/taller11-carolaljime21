package paquete01;

import java.util.ArrayList;
import paquete03.*;
import paquete02.*;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Menu> listaMenu = new ArrayList<>();

        MenuNinios menuNi1 = new MenuNinios("Cajita Feliz", 5, 1, 1);
        menuNi1.establecerValorMenu();
        MenuNinios menuNi2 = new MenuNinios("Big burguer", 4, 1, 2);
        menuNi2.establecerValorMenu();
        
        MenuEconomico economico = new MenuEconomico("Arroz relleno", 3, 0.10);
        economico.establecerValorMenu();
        
        MenuDia dia = new MenuDia("Pollo entero", 12, 2, 1);
        dia.establecerValorMenu();

        MenuCarta carta = new MenuCarta("Alitas BBQ", 5, 1, 1, 1);
        carta.establecerValorMenu();

        listaMenu.add(menuNi1);
        listaMenu.add(menuNi2);
        listaMenu.add(economico);
        listaMenu.add(dia);
        listaMenu.add(carta);
        
        Cuenta cliente = new Cuenta("Carolina Alvarado", 0.12, listaMenu);
        cliente.establecerSubTotal();
        cliente.establecerValorCancelar();
        System.out.printf("%s\n", cliente);

    }
}
