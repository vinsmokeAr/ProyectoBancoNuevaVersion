/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 29 may. 2023
* Fecha de modificación: 29 may. 2023
* Descripción: Se hizo la conexión de la capa controller del empleado.
 */
package controller;

import entity.Empleados;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.EmpleadoModelImpl;
import model.IEmpleadoModel;

public class EmpleadoController {

    IEmpleadoModel modelo = new EmpleadoModelImpl();

    /**
     *
     * Método para agregar el registro de un empleado
     *
     * @param listaE
     * @param empleado
     */
    public void agregarRegistro(List<Empleados> listaE, Empleados empleado) {
        modelo.agregarRegistro(listaE, empleado);
    }

    /**
     *
     * Método para eliminar el registro de un empleado
     *
     */    
    public void eliminarRegistro(List<Empleados> listaE, String cod) {
        modelo.eliminarRegistro(listaE, cod);
    }

    /**
     *
     * Método para modificar el registro de un empleado
     *
     */    
    public void modificarRegistro(List<Empleados> listaE, Empleados empleado) {
        modelo.modificarRegistro(listaE, empleado);
    }

    /**
     *
     * Método para mostrar el registro de un empleado
     *
     */    
    public void mostrarRegistros(List<Empleados> listaE, DefaultTableModel modeloT) {
        modelo.mostrarRegistros(listaE, modeloT);
    }

}
