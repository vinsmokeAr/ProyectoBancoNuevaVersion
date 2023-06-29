/*****************************************************
 * Autor: Arleth Machuca Fabian          *
 * Fecha de creación: 26 jun 2023                        *
 * Fecha de actualización: 26 jun 2023                   *
 * Descripción: Clase para 
 *****************************************************/

package entity;

import java.util.ArrayList;
import java.util.List;


public class Datos {
    public static enum TiposMov {
        Deposito,
        Retiro
    }
    
    private List<Empleados> listaEmpleados;
    private List<Cliente> listaClientes;
    private List<Movimiento> listaMovimientos;
    private List<Cuenta> listaCuentas;
    private static Datos este;

    public Datos() {
        this.listaEmpleados = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
        this.listaMovimientos = new ArrayList<>();
        this.listaCuentas = new ArrayList<>();
        este = this;
    }   

    public static List<Empleados> getListaEmpleados() {
        return este.listaEmpleados;
    }

    public static List<Cliente> getListaClientes() {
        return este.listaClientes;
    }

    public static List<Movimiento> getListaMovimientos() {
        return este.listaMovimientos;
    }

    public static List<Cuenta> getListaCuentas() {
        return este.listaCuentas;
    }
    
    
}
