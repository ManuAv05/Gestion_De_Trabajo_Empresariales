import java.util.Date;

public abstract class Trabajadores {
    protected String nombre;

    protected String apellido;

    protected String DNI;

    protected int edad;

    protected String Direccion;

    protected Date fecha_Ingreso;

    protected int sueldo_base;

    public Trabajadores(String nombre, String apellido, String dni, int edad, String direccion, Date fechaIngreso, int sueldoBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        DNI = dni;
        this.edad = edad;
        Direccion = direccion;
        fecha_Ingreso = fechaIngreso;
        sueldo_base = sueldoBase;
    }

    public void mostrarInformacion() {

    }


}
