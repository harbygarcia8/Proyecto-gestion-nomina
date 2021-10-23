package ProyectosHarby.Nomina.dominio;

public class Vendedor extends Empleado_Directo{
    public static final double COMISION_MAYOR = 0.055;
    public static final double COMISION_MENOR = 0.045;
    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    public long calcularComision(){
        double comision;
        if(this.getSalario() <= 999.999){
            comision = this.ventasDelMes * COMISION_MENOR;
        }else {
            comision = this.ventasDelMes * COMISION_MAYOR;
        }
        return (long) comision;
    }

    public long getVentasDelMes() {
        return ventasDelMes;
    }

    public void setVentasDelMes(long ventasDelMes) {
        this.ventasDelMes = ventasDelMes;
    }
}
