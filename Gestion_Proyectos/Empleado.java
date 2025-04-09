import java.util.Date;

public class Empleado extends Trabajadores {
    private String cargo;

    private String puesto_trabajo;

    public Empleado(final String cargo, final String puesto_trabajo, String nombre, String apellido, String dni, int edad, String direccion, Date fechaIngreso, int sueldoBase) {
        super(nombre, apellido, dni, edad, direccion, fechaIngreso, sueldoBase);
        this.cargo = cargo;
        this.puesto_trabajo = puesto_trabajo;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + DNI);
        System.out.println("Edad: " + edad);
        System.out.println("Direccion: " + Direccion);
        System.out.println("Fecha de Ingreso: " + fecha_Ingreso);
        System.out.println("Sueldo Base: " + sueldo_base);
        System.out.println("Cargo: " + cargo);
        System.out.println("Puesto de Trabajo: " + puesto_trabajo);

    }

}