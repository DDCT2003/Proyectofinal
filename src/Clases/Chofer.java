package Clases;

public class Chofer extends Usuario{
    private String horario, estado;

    public Chofer(String cedula, String nombre, String apellido, String horario, String estado) {
        super(cedula, nombre, apellido);
        this.horario = horario;
        this.estado = estado;
    }


}
