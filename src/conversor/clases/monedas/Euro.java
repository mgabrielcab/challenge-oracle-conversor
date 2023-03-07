package conversor.clases.monedas;

public class Euro extends Monedas {

    private static final double TIPO_CAMBIO_USD = 1.06;
    private static final double TIPO_CAMBIO_GBP = 0.89;
    private static final double TIPO_CAMBIO_PESO = 210.66;

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double convertirADolar() {
        return valor * TIPO_CAMBIO_USD;
    }

    @Override
    public double convertirAEuro() {
        return valor;
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
