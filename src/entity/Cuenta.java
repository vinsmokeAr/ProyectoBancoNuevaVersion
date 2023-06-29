/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 21 mayo 2023
* Fecha de modificación: 09 junio 2023
* Descripción: Se realizó la clase abstracta cuenta.
*/
package entity;

public abstract class Cuenta {
    private String nombre;
    private final String numeroCuenta;
    protected double saldo;
    private final Cliente cliente;

    public Cuenta(String numeroCuenta,String nombre, double saldo, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public abstract boolean retirar(double monto);
}



