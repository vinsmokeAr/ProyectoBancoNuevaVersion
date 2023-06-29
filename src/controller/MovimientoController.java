/*****************************************************
 * Autor: Arleth Machucha Fabian                     *
 * Fecha de creación: 29 jun 2023                    *
 * Fecha de actualización: 29 jun 2023               *
 * Descripción: Clase para los movimientos.
 *****************************************************/

package controller;

import entity.Movimiento;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.IMovimientoModel;
import model.MovimientoModelImpl;


public class MovimientoController {
    IMovimientoModel modelo =  new MovimientoModelImpl();
    public void agregarRegistro(Movimiento movimiento){
        modelo.agregarRegistro(movimiento);
    }
    public void mostrarRegistros(String RFC,DefaultTableModel modeloT){
        modelo.mostrarRegistros(RFC, modeloT);
    }
    public void obtenerRegistrosAs(String RFC, List<Movimiento> lista){
        modelo.obtenerRegistrosAs(RFC, lista);
    }
    public Movimiento obtenerRegistro(String numCuenta){
        return null;
    }
}
