/** ***************************************************
 * Autor: Arleth Machuca Fabian           *
 * Fecha de creación: 28 jun 2023                        *
 * Fecha de actualización: 28 jun 2023                   *
 * Descripción: Clase para
 **************************************************** */
package model;

import entity.Cuenta;
import entity.Datos;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CuentaModelImpl implements ICuentaModel {

    @Override
    public void agregarRegistro(Cuenta cuenta) {
        if (validRegistro(cuenta.getNumeroCuenta())) {
            Datos.getListaCuentas().add(cuenta);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Esta cuenta ya existe", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void eliminarRegistro(String numCuenta) {
        for (Cuenta cuenta : Datos.getListaCuentas()) {
            if (cuenta.getNumeroCuenta().equals(numCuenta)) {
                Datos.getListaCuentas().remove(cuenta);
                JOptionPane.showMessageDialog(null,
                        "Cuenta eliminada", "Operación exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }

    @Override
    public void modificarRegistro(Cuenta cuenta) {
        int i = 0;
        for (Cuenta cuentaL : Datos.getListaCuentas()) {
            if (cuentaL.getNumeroCuenta().equals(cuenta.getNumeroCuenta())) {
                Datos.getListaCuentas().set(i, cuenta);
                JOptionPane.showMessageDialog(null,
                        "Cuenta modificada", "Operación exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            i++;
        }
    }

    @Override
    public Cuenta obtenerRegistro(String numCuenta) {
        for (Cuenta cuentaL : Datos.getListaCuentas()) {
            if (cuentaL.getNumeroCuenta().equals(numCuenta)) {
                return cuentaL;
            }
        }
        return null;
    }

    @Override
    public void mostrarRegistros(String RFC, DefaultTableModel modeloT) {
        modeloT.setRowCount(0);
        for (Cuenta cuenta : Datos.getListaCuentas()) {
            if (cuenta.getCliente().getRFC().equals(RFC)) {
                Object[] fila = new Object[2];
                fila[0] = cuenta.getNombre();
                fila[1] = cuenta.getSaldo();
                modeloT.addRow(fila);
            }

        }
    }

    @Override
    public void obtenerRegistrosAs(String RFC, List<Cuenta> lista) {
        for (Cuenta cuenta : Datos.getListaCuentas()) {
            if (cuenta.getCliente().getRFC().equals(RFC)) {
                lista.add(cuenta);
            }

        }
    }

    private boolean validRegistro(String id) {
        for (Cuenta cuenta : Datos.getListaCuentas()) {
            if (cuenta.getNumeroCuenta().equals(id)) {
                return false;
            }
        }
        return true;
    }

}
