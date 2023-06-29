/*****************************************************
 * Autor: Arleth Machuca Fabian           *
 * Fecha de creación: 26 jun 2023                        *
 * Fecha de actualización: 26 jun 2023                   *
 * Descripción: Clase para 
 *****************************************************/

package controller;

import entity.Cuenta;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.CuentaModelImpl;
import model.ICuentaModel;


public class CuentaController {
    ICuentaModel modelo = new CuentaModelImpl();
    
    public void agregarRegistro(Cuenta cuenta) {
        this.modelo.agregarRegistro(cuenta);
    }

    /**
     *
     * Método para eliminar el registro de un cliente
     *
     * @param numCuenta
     */
    public void eliminarRegistro(String numCuenta) {
        this.modelo.eliminarRegistro(numCuenta);
    }

    /**
     *
     * Método para modificar el registro de un cliente
     *
     * @param cuenta
     */
    public void modificarRegistro(Cuenta cuenta) {
        this.modelo.modificarRegistro(cuenta);
    }
    
    public void mostrarRegistros(String RFC,DefaultTableModel modeloT) {
        modelo.mostrarRegistros(RFC,modeloT);
    }

    /**
     *
     * Método para obtener el registro de un cliente
     *
     * @param numCuenta
     * @return 
     */

    public Cuenta obtenerCuenta(String numCuenta) {
        return this.modelo.obtenerRegistro(numCuenta);
    }
    
    public void obtenerRegistrosAs(String RFC, List<Cuenta> lista){
        modelo.obtenerRegistrosAs(RFC, lista);
    }
    
    
}
