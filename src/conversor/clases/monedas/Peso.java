package conversor.clases.monedas;

public class Peso extends Monedas {
    
    private static final double TIPO_CAMBIO_USD=0.0050;
    private static final double TIPO_CAMBIO_EUR=0.0047;
    private static final double TIPO_CAMBIO_GBP=0.0042;

    public Peso(double valor) {
        super(valor);
    }

    @Override
    public double convertirADolar() {
        return valor*TIPO_CAMBIO_USD;
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
        return valor;
    }


}
