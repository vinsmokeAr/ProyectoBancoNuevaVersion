/** ***************************************************
 * Autor: Arleth Machuca Fabian                       *
 * Fecha de creación: 26 jun 2023                     *
 * Fecha de actualización: 26 jun 2023                *
 * Descripción: Clase para los movimientos.
 **************************************************** */
package entity;

import java.util.Date;

public class Movimiento {

    private double monto;
    private Cuenta cuenta;
    private int tipo;
    private Date fecha;

    public Movimiento(double monto, Cliente cliente,
            Cuenta cuenta, int tipo, Date fecha) {
        this.monto = monto;
        this.cuenta = cuenta;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
