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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Date getFecha_Ingreso() {
        return fecha_Ingreso;
    }

    public void setFecha_Ingreso(Date fecha_Ingreso) {
        this.fecha_Ingreso = fecha_Ingreso;
    }

    public int getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(int sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    @Override
    public String toString() {
        return "Trabajadores{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", edad=" + edad +
                ", Direccion='" + Direccion + '\'' +
                ", fecha_Ingreso=" + fecha_Ingreso +
                ", sueldo_base=" + sueldo_base +
                '}';
    }
}
