public class Main {
    public static void main(String[] args) {
        Departamento departamento1= new Departamento();
        Departamento departamento2= new Departamento();
        Empleado empleado1 = new Empleado("carlos");
        Empleado empleado2 = new Empleado("pablo");
        Empleado empleado3 = new Empleado("santiago");
        departamento2.agregar(empleado2);
        departamento2.agregar(empleado3);
        departamento1.agregar(empleado1);
        departamento1.agregar(departamento2);
        departamento1.operacion();
    }

}