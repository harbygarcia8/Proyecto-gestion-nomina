package ProyectosHarby.Nomina.dominio;

public abstract class Empleado {

    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract long calcularSalario();

    public String getNombre() {
        return nombre;
    }


}
