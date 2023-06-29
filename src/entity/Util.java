/** ***************************************************
 * Autor: Arleth Machuca Fabian          *
 * Fecha de creación: 28 jun 2023                        *
 * Fecha de actualización: 28 jun 2023                   *
 * Descripción: Clase para utilidades y metodos de
 * validación.
 **************************************************** */
package entity;

import java.util.HashMap;
import java.util.Map;

public class Util {

    // Lleva la cuenta de las cuentas ya usadas para que no se repitan.
    private static final Map<String, String> contadorCuentas = new HashMap<>();

    /**
     * Este método genera numeros de cuenta que no se repitan para cada cliente.
     *
     * @param tipoCuenta El tipo de cuenta para el número de cuenta.
     * @return La cadena del número de cuenta.
     */
    public static String generarNumeroCuenta(String tipoCuenta) {
        String numeroCuenta;

        do {
            numeroCuenta = "2085 2066 62 ";
            // Genera los dígitos aleatorios para el número de cuenta
            for (int i = 0; i < 10; i++) {
                int digito = (int) (Math.random() * 10);
                numeroCuenta += digito;
            }
            // Si el número de cuenta generado ya existe intenta crear uno nuevo.
        } while (contadorCuentas.containsKey(numeroCuenta));

        contadorCuentas.put(numeroCuenta, tipoCuenta);

        return numeroCuenta;
    }
}
