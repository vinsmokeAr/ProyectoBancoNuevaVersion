/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 29 may. 2023
* Fecha de modificación: 11 junio 2023
* Descripción: Se hizo la conexión de la capa controller del cliente.
 */
package controller;

import entity.Cliente;
import javax.swing.table.DefaultTableModel;
import model.ClienteModelImpl;
import model.IClienteModel;

public class ClienteController {

    IClienteModel modelo = new ClienteModelImpl();

    /**
     *
     * Método para agregar el registro de un cliente
     *
     */

    public void agregarRegistro(Cliente cliente) {
        this.modelo.agregarRegistro(cliente);
    }

    /**
     *
     * Método para eliminar el registro de un cliente
     *
     */
    public void eliminarRegistro(String rfc) {
        this.modelo.eliminarRegistro(rfc);
    }

    /**
     *
     * Método para modificar el registro de un cliente
     *
     */
    public void modificarRegistro(Cliente cliente) {
        this.modelo.modificarRegistro(cliente);
    }

    /**
     *
     * Método para mostrar el registro de un cliente
     *
     */

    public void mostrarRegistros(DefaultTableModel modeloT) {
        this.modelo.mostrarRegistros(modeloT);
    }

    /**
     *
     * Método para obtener el registro de un cliente
     *
     */

    public Cliente obtenerCliente(String rfc) {
        return this.modelo.obtenerRegistro(rfc);
    }
}
