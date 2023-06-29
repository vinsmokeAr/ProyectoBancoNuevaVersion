/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 17 / mayo / 23
* Fecha de modificación: 23 / mayo / 23
* Descripción: Se creó la interfáz de clientes.
 */
package model;

import entity.Cliente;
import javax.swing.table.DefaultTableModel;

public interface IClienteModel {

    /**
     *
     * Se creó el método en la interfáz de clientes para agregar el registro de
     * un cliente
     */
    void agregarRegistro(Cliente cliente);

    /**
     *
     * Se creó el método en la interfáz de clientes para eliminar el registro de
     * un cliente
     */
    void eliminarRegistro(String rfc);

    /**
     *
     * Se creó el método en la interfáz de clientes para modificar el registro
     * de un cliente
     */
    void modificarRegistro(Cliente cliente);

    /**
     *
     * Se creó el método en la interfáz de clientes para mostrar el registro de
     * un cliente
     */
    void mostrarRegistros(DefaultTableModel modeloT);

    Cliente obtenerRegistro(String rfc);
}
