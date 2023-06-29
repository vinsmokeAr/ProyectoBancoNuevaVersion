/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 29 may. 2023
* Fecha de modificación: 29 may. 2023
* Descripción: Se creó la interfáz de ingresar clientes.
 */
package model;

import entity.Empleados;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public interface IEmpleadoModel {

    /**
     *
     * Se creó el método en la interfáz de empleado para agregar el registro de
     * un empleado
     */
    void agregarRegistro(List<Empleados> listaE, Empleados empleado);

    /**
     *
     * Se creó el método en la interfáz de empleado para eliminar el registro de
     * un empleado
     */
    void eliminarRegistro(List<Empleados> listaE, String cod);

    /**
     *
     * Se creó el método en la interfáz de empleado para modificar el registro
     * de un empleado
     */
    void modificarRegistro(List<Empleados> listaE, Empleados empleado);

    /**
     *
     * Se creó el método en la interfáz de empleadoo para mostrar el registro de
     * un empleado
     */
    void mostrarRegistros(List<Empleados> listaE, DefaultTableModel modeloT);
}
