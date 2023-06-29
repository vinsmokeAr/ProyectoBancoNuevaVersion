/** ***************************************************
 * Autor: Arleth Machuca Fabian           *
 * Fecha de creación: 29 jun 2023                     *
 * Fecha de actualización: 29 jun 2023                *
 * Descripción: Interfaz de la clase
 **************************************************** */
package model;

import entity.Movimiento;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public interface IMovimientoModel {

    public void agregarRegistro(Movimiento movimiento);

    public void mostrarRegistros(String RFC, DefaultTableModel modeloT);

    public void obtenerRegistrosAs(String RFC, List<Movimiento> lista);
}
