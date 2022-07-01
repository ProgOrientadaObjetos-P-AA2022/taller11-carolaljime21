package paquete02;

public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;

    public Menu(String nom, double v) {
        nombrePlato = nom;
        valorInicial = v;
    }

    public void establecerNombrePlato(String x) {
        nombrePlato = x;
    }

    public void establecerValorInicial(double x) {
        valorInicial = x;
    }

    public abstract void establecerValorMenu();

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorInicial() {
        return valorInicial;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("\tPlato: %s\n"
                + "\tValor inicial: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorInicial());
        return cadena;
    }

}
