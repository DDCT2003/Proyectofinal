package Clases;

public class Administrador extends Usuario{
    private String sucursal;

    public Administrador(String cedula, String nombre, String apellido, String sucursal) {
        super(cedula, nombre, apellido);
        this.sucursal = sucursal;
    }
}

