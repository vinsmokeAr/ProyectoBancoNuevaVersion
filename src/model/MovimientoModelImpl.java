/** ***************************************************
 * Autor: Arleth Machuca Fabian           *
 * Fecha de creación: 29 jun 2023                        *
 * Fecha de actualización: 29 jun 2023                   *
 * Descripción: Clase para
 **************************************************** */
package model;

import entity.Datos;
import entity.Movimiento;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MovimientoModelImpl implements IMovimientoModel {

    @Override
    public void agregarRegistro(Movimiento movimiento) {
        Datos.getListaMovimientos().add(movimiento);
    }

    @Override
    public void mostrarRegistros(String RFC, DefaultTableModel modeloT) {
        modeloT.setRowCount(0);
        for (Movimiento movi : Datos.getListaMovimientos()) {
            if (movi.getCuenta().getCliente().getRFC().equals(RFC)) {
                Object[] fila = new Object[5];
                fila[0] = Datos.TiposMov.values()[movi.getTipo()];
                fila[1] = movi.getCuenta().getNombre();
                fila[2] = "$" + movi.getMonto();
                fila[3] = "$" + movi.getCuenta().getSaldo();
                fila[4] = movi.getFecha();

                modeloT.addRow(fila);
            }
        }
    }

    @Override
    public void obtenerRegistrosAs(String RFC, List<Movimiento> lista) {
        lista = new ArrayList<>();
        for (Movimiento movimiento : Datos.getListaMovimientos()) {
            if (movimiento.getCuenta().getCliente().getRFC().equals(RFC)) {
                lista.add(movimiento);
            }
        }
    }
}
