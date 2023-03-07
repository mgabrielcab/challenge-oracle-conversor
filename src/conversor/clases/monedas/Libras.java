package conversor.clases.monedas;

public class Libras extends Monedas {

    private static final double TIPO_CAMBIO_USD = 1.18;
    private static final double TIPO_CAMBIO_EUR = 1.12;
    private static final double TIPO_CAMBIO_PESO = 236.17;

    public Libras(double valor) {
        super(valor);
    }

    @Override
    public double convertirADolar() {
        return valor * TIPO_CAMBIO_USD;
    }

    @Override
    public double convertirAEuro() {
        return valor * TIPO_CAMBIO_EUR;
    }

    @Override
    public double convertirALibra() {
        return valor;
    }

    @Override
    public double convertirAPesos() {
        return valor * TIPO_CAMBIO_PESO;
    }

}
