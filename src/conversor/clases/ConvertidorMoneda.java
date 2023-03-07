package conversor.clases;

import conversor.clases.monedas.Dolar;
import conversor.clases.monedas.Euro;
import conversor.clases.monedas.Libras;
import conversor.clases.monedas.Monedas;
import conversor.clases.monedas.Peso;

public class ConvertidorMoneda {

    //Constructor
    private static Monedas crearMoneda(String nombreMonedaOrigen, double valor) {
        switch (nombreMonedaOrigen.toLowerCase()) {
            case "dolar":
            case "dólar":
                System.out.println("Creando Moneda Dolar");
                return new Dolar(valor);
            case "euro":
                System.out.println("Creando Moneda Euro");
                return new Euro(valor);

            case "libras":
                System.out.println("Creando Moneda Libra");
                return new Libras(valor);
            case "pesos":
                System.out.println("Creando Moneda Peso");
                return new Peso(valor);
            default:
                throw new IllegalArgumentException("Moneda no soportada");
        }
    }

    public String conversion(String nombreOrigen, String nombreDestino, double valor) {
        Monedas monedaOrigen = crearMoneda(nombreOrigen, valor);
        switch (nombreDestino.toLowerCase()) {
            case "pesos" -> {
                System.out.println("Convirtiendo a Pesos " + Double.toString(monedaOrigen.convertirAPesos()));
                return Double.toString(monedaOrigen.convertirAPesos());
            }
            case "dolar" -> {
                return Double.toString(monedaOrigen.convertirADolar());
            }
            case "libras" -> {
                return Double.toString(monedaOrigen.convertirALibra());
            }
            case "euro" -> {
                System.out.println("Convirtiendo a Euros " + monedaOrigen.convertirAEuro());
                System.out.println("Valor:$" + valor);
                System.out.println("conversion: " + monedaOrigen.convertirAEuro());
                return Double.toString(monedaOrigen.convertirAEuro());
            }
            default ->
                throw new AssertionError("Conversion incorrecta");
        }
    }

}
