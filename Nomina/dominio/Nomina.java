package ProyectosHarby.Nomina.dominio;

import java.util.ArrayList;

public class Nomina {
    private ArrayList<Empleado> empleados;

    public Nomina() {
        this.empleados = new ArrayList<Empleado>();
    }

    public void calcularNomina(){
        for (Empleado empleado: empleados) {
            System.out.println("El salario de " + empleado.getNombre() + " es de: " + empleado.calcularSalario());
        }
    }

    public void listarDirectos(){
        for (Empleado empleado: empleados) {
            if(empleado instanceof Empleado_Directo){
                System.out.println(empleado.getNombre());
            }
        }
    }

    public void listarFreelancers(){
        for (Empleado empleado: empleados) {
            if(empleado instanceof Freelance){
                System.out.println(empleado.getNombre());
            }
        }
    }

    public void listarPromotores(){
        for (Empleado empleado: empleados) {
            if(empleado instanceof Promotor){
                System.out.println(empleado.getNombre());
            }
        }
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
}
