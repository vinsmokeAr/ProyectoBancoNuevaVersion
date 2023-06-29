/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 30 mayo 2023
* Fecha de modificación: 08 junio 2023
* Descripción: Se creó la cuenta corriente que hereda atributos de la clase 
* abstracta cuenta.
 */
package entity;

import javax.swing.JOptionPane;

/**
 * Clase que representa una cuenta corriente, que hereda de la clase Cuenta.
 */
public class CuentaCorriente extends Cuenta {

    private final double limiteSobregiro;
    private final double comisionSobregiro;

    /**
     * Constructor de la clase CuentaCorriente.
     *
     * @param numeroCuenta El número de cuenta.
     * @param saldo El saldo de la cuenta.
     * @param cliente El cliente asociado a la cuenta.
     * @param nombre El nombre de la cuenta
     * @param limiteSobregiro El límite de sobregiro permitido en la cuenta.
     * @param comisionSobregiro La comisión por sobregiro aplicada a la cuenta.
     */
    public CuentaCorriente(double limiteSobregiro, double comisionSobregiro, String numeroCuenta, String nombre, double saldo, Cliente cliente) {
        super(numeroCuenta, nombre, saldo, cliente);
        this.limiteSobregiro = limiteSobregiro;
        this.comisionSobregiro = comisionSobregiro;
    }

    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public double getComisionSobregiro() {
        return comisionSobregiro;
    }

    /**
     * Lógica específica para retirar dinero de una cuenta corriente
     *
     * @param monto:
     */
    @Override
    public boolean retirar(double monto) {
        // Verificar si el monto del retiro supera el saldo más el límite de sobregiro
        if (monto <= getSaldo() + getLimiteSobregiro()) {
            // Realizar el retiro
            saldo -= monto;
            return true;
        } else {
            JOptionPane.showMessageDialog(null, 
                    "Monto de retiro excede el saldo disponible y el límite de "
                            + "sobregiro. El cual es "
                    + getSaldo() + getLimiteSobregiro(), 
                    "Error de retiro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
