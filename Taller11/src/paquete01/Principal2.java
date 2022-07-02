package paquete01;

import java.util.ArrayList;
import paquete02.*;
import paquete03.*;

public class Principal2 {

    public static void main(String[] args) {

        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};

        // Lista de Menus
        ArrayList<Menu> lista = new ArrayList<>();

        for (int i = 0; i < datos001.length; i++) {
            MenuNinio mNino = new MenuNinio(datos001[i][0],
                    Double.parseDouble(datos001[i][1]),
                    Double.parseDouble(datos001[i][2]),
                    Double.parseDouble(datos001[i][3]));
            mNino.establecerValorMenu();
            lista.add(mNino);
        }
        for (int i = 0; i < datos002.length; i++) {
            MenuEconomico mEcon = new MenuEconomico(datos002[i][0],
                    Double.parseDouble(datos002[i][1]),
                    Double.parseDouble(datos002[i][2]));
            mEcon.establecerValorMenu();
            lista.add(mEcon);
        }
        for (int i = 0; i < datos003.length; i++) {
            MenuDia mDia = new MenuDia(datos003[i][0],
                    Double.parseDouble(datos003[i][1]),
                    Double.parseDouble(datos003[i][2]),
                    Double.parseDouble(datos003[i][3])
            );
            mDia.establecerValorMenu();
            lista.add(mDia);
        }
        for (int i = 0; i < datos004.length; i++) {
            MenuCarta mCarta = new MenuCarta(datos004[i][0],
                    Double.parseDouble(datos004[i][1]),
                    Double.parseDouble(datos004[i][2]),
                    Double.parseDouble(datos004[i][3]),
                    Double.parseDouble(datos004[i][4]));

            mCarta.establecerValorMenu();
            lista.add(mCarta);
        }

        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        // Fin de solución
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerValorMenu();
        }

        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", 10, lista);
        miCuenta.establecerSubTotal();
        miCuenta.establecerValorCancelar();
        System.out.printf("%s\n", miCuenta);
    }
}
