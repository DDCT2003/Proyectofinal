package Clases;

public class Cliente extends Usuario{

    private String correoElectronico;
    private int estado;
    public Cliente(String cedula, String nombre, String apellido, String correoElectronico, int estado) {
        super(cedula, nombre, apellido);
        this.correoElectronico = correoElectronico;
        this.estado = estado;
    }


}
