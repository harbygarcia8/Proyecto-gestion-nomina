package ProyectosHarby.Nomina.dominio;

public class Empleado_Directo extends Empleado{
    public static final double SALUD = 0.04;
    public static final double PENSION = 0.065;

    private long salario;


    public Empleado_Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    @Override
    public long calcularSalario() {
        return (this.salario - (calcularSalud() + calcularPension()));
    }

    public long calcularSalud(){
        return (long) (this.salario*SALUD);
    }

    public long calcularPension(){
        return (long) (this.salario*PENSION);
    }

    public long getSalario() {
        return salario;
    }
}
