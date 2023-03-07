package conversor.clases.monedas;

public abstract class Monedas {

    protected double valor;

    public Monedas(double valor) {
        this.valor = valor;
    }

    public abstract double convertirADolar();

    public abstract double convertirAEuro();

    public abstract double convertirALibra();

    public abstract double convertirAPesos();

}
