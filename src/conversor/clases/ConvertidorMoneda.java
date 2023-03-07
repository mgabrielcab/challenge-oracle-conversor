package conversor.clases;

import conversor.clases.monedas.Dolar;
import conversor.clases.monedas.Euro;
import conversor.clases.monedas.Libras;
import conversor.clases.monedas.Monedas;
import conversor.clases.monedas.Peso;

public class ConvertidorMoneda {

    //Constructor
    private static Monedas crearMoneda(String nombreMonedaOrigen, double valor) {
        return switch (nombreMonedaOrigen.toLowerCase()) {
            case "dolar", "dólar" -> {
                System.out.println("Creando Moneda Dolar");
                yield new Dolar(valor);
            }
            case "euro" -> {
                System.out.println("Creando Moneda Euro");
                yield new Euro(valor);
            }
            case "libras" -> {
                System.out.println("Creando Moneda Libra");
                yield new Libras(valor);
            }
            case "pesos" -> {
                System.out.println("Creando Moneda Peso");
                yield new Peso(valor);
            }
            default -> throw new IllegalArgumentException("Moneda no soportada");
        };
    }

    public String conversion(String nombreOrigen, String nombreDestino, double valor) {
        Monedas monedaOrigen = crearMoneda(nombreOrigen, valor);
        switch (nombreDestino.toLowerCase()) {
            case "pesos" -> {
                System.out.println("Convirtiendo a Pesos " + Double.toString(monedaOrigen.convertirAPesos()));
                return Double.toString(monedaOrigen.convertirAPesos());
            }
            case "dolar","dólar" -> {
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
