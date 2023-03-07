package conversor.clases.monedas;

public class Dolar extends Monedas {
    private static final double TIPO_CAMBIO_GBP = 0.85;
    private static final double TIPO_CAMBIO_EUR = 0.95;
    private static final double TIPO_CAMBIO_PESO = 199.70;

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double convertirADolar() {
        return valor;
    }

    @Override
    public double convertirAEuro() {
        return valor*TIPO_CAMBIO_EUR;
    }

    @Override
    public double convertirALibra() {
        return valor*TIPO_CAMBIO_GBP;
    }

    @Override
    public double convertirAPesos() {
        return valor*TIPO_CAMBIO_PESO;
    }
}
