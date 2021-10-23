package ProyectosHarby.Nomina.app;

import ProyectosHarby.Nomina.dominio.*;

public class appNomina {
    public static void main(String[] args) {
        Nomina nomina_empleados = new Nomina();

        Vendedor julian = new Vendedor("Julian", 2410000,62106200);
        Vendedor carolina = new Vendedor("Carolina", 998000,71589600);

        Freelance johanna = new Freelance("Johanna", 120000,79);
        Freelance gustavo = new Freelance("Gustavo", 70500,64);

        Promotor pedro = new Promotor("Pedro", 974,190,68);

        Empleado_Directo david = new Empleado_Directo("David",3578000);
        Empleado_Directo juan = new Empleado_Directo("juan",6812000);

        nomina_empleados.getEmpleados().add(julian);
        nomina_empleados.getEmpleados().add(carolina);
        nomina_empleados.getEmpleados().add(johanna);
        nomina_empleados.getEmpleados().add(gustavo);
        nomina_empleados.getEmpleados().add(pedro);
        nomina_empleados.getEmpleados().add(david);
        nomina_empleados.getEmpleados().add(juan);

        System.out.println("***** Salario de empleados****");

        nomina_empleados.calcularNomina();
        System.out.println("\n");
        System.out.println("Empleados directos: ");
        nomina_empleados.listarDirectos();
        System.out.println("\n");

        System.out.println("Empleados freelancers: ");
        nomina_empleados.listarFreelancers();
        System.out.println("\n");

        System.out.println("Empleados promotores: ");
        nomina_empleados.listarPromotores();
        System.out.println("\n");
    }
}
