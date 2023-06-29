/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 29 may. 2023
* Fecha de modificación: 29 may. 2023
* Descripción: Se creó .
 */
package model;

import entity.Datos;
import entity.Empleados;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmpleadoModelImpl implements IEmpleadoModel {

    /**
     *
     * Se implementó el método de la interfáz de empleado para agregar el
     * registro de un empleado
     */
    @Override
    public void agregarRegistro(List<Empleados> listaE, Empleados empleado) {
        if (validRegistro(empleado.getCodEmpleado())) {
            listaE.add(empleado);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Este empleado ya existe", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     *
     * Se implementó el método de la interfáz de empleado para eliminar el
     * registro de un empleado
     */
    @Override
    public void eliminarRegistro(List<Empleados> listaE, String cod) {
        for (Empleados empleados : listaE) {
            if (empleados.getCodEmpleado().compareTo(cod) == 0) {
                listaE.remove(empleados);
                JOptionPane.showMessageDialog(null,
                        "Empleado eliminado", "Operación exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }

    /**
     *
     * Se implementó el método de la interfáz de empleado para modificar el
     * registro de un empleado
     */
    @Override
    public void modificarRegistro(List<Empleados> listaE, Empleados empleado) {
        int i = 0;
        for (Empleados empleados : listaE) {
            if (empleado.getCodEmpleado().equals(empleados.getCodEmpleado())) {
                listaE.set(i, empleado);
                JOptionPane.showMessageDialog(null,
                        "Empleado modificado", "Operación exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            i++;
        }
    }

    /**
     *
     * Se implementó el método de la interfáz de empleado para mostrar el
     * registro de un empleado
     */
    @Override
    public void mostrarRegistros(List<Empleados> listaE, DefaultTableModel modeloT) {
        modeloT.setRowCount(0);
        for (Empleados empleados : listaE) {
            Object[] fila = new Object[3];
            fila[0] = empleados.getCodEmpleado();
            fila[1] = empleados.getNombre();
            fila[2] = empleados.getTelefono();
            modeloT.addRow(fila);
        }

    }

    /**
     *
     * Se creó el método para validar el registro para que no se repitan
     * empleados
     */
    private boolean validRegistro(String id) {
        for (Empleados empleado : Datos.getListaEmpleados()) {
            if (empleado.getCodEmpleado().equals(id)) {
                return false;
            }
        }
        return true;
    }
}
