/** ***************************************************
 * Autor: Arleth Machuca Fabian          *
 * Fecha de creación: 28 jun 2023                     *
 * Fecha de actualización: 28 jun 2023                *
 * Descripción: Interfaz de la clase cuenta.
 **************************************************** */
package model;

import entity.Cuenta;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public interface ICuentaModel {

    public void agregarRegistro(Cuenta cuenta);

    public void eliminarRegistro(String numCuenta);

    public void modificarRegistro(Cuenta cuenta);

    public void mostrarRegistros(String RFC, DefaultTableModel modeloT);

    public void obtenerRegistrosAs(String RFC, List<Cuenta> lista);

    public Cuenta obtenerRegistro(String numCuenta);
}
