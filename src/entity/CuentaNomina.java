/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 30 mayo 2023
* Fecha de modificación: 08 junio 2023
* Descripción: Se creó la cuenta nómina que hereda atributos de la clase abstracta
* cuenta.
 */
package entity;

import javax.swing.JOptionPane;

/**
 * Clase que representa una cuenta de nómina, que hereda de la clase Cuenta.
 */
public class CuentaNomina extends Cuenta {

    private String empresa;

    /**
     * Constructor de la clase CuentaNomina.
     *
     * @param empresa Empresa que Nos da la nomina
     * @param numeroCuenta El número de cuenta.
     * @param nombre Nombred de la cuenta.
     * @param saldo El saldo de la cuenta.
     * @param cliente El cliente asociado a la cuenta.
     */
    public CuentaNomina(String empresa, String numeroCuenta, String nombre, double saldo, Cliente cliente) {    
        super(numeroCuenta, nombre, saldo, cliente);
        this.empresa = empresa;
    }

    /**
     * Método para realizar un retiro de dinero.
     *
     * @param monto El monto a retirar.
     */
    @Override
    public boolean retirar(double monto) {
        // No se permite retirar dinero de una cuenta de nómina
        JOptionPane.showMessageDialog(null,
                "No está permitidi retirar dinero de una cuenta de nómina.",
                "Error de retiro", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
