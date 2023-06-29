/*
* Autor: Arleth Machuca Fabian 406
* Fecha de creación: 30 mayo 2023
* Fecha de modificación: 08 junio 2023
* Descripción: Se creó la cuenta Persona que heredará atributos a las clases empleado y clientes.
 */
package entity;

/**
 *
 * Se creó la clase persona, la cual heredará atributos a empleados y clientes
 */
public class Persona {

    private String nombre;
    private String telefono;
    private String direccion;

    public Persona() {
    }

    public Persona(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    //Métodos Get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
