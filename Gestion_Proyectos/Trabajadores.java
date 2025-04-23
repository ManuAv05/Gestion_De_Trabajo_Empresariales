import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trabajadores {
    static Scanner sc = new Scanner(System.in);
    protected String nombre;

    protected String apellido;

    protected String DNI;

    protected int edad;

    protected String Direccion;

    protected LocalDate fecha_Ingreso;

    protected int sueldo_base;

    public Trabajadores(String nombre, String apellido, String dni, int edad, String direccion, LocalDate fechaIngreso, int sueldoBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        DNI = dni;
        this.edad = edad;
        Direccion = direccion;
        fecha_Ingreso = fechaIngreso;
        sueldo_base = sueldoBase;
    }

    public static List<Trabajadores> listasTrabajadores() {
        List<Trabajadores> trabajadores = new ArrayList<>();
        System.out.println("Cuantos trabajadores desea ingresar?");
        int contador = sc.nextInt();
        while (contador > 0) {
            contador--;
            System.out.println("Ingrese el nombre del trabajador:");
            String nombre = sc.next();
            System.out.println("Ingrese el apellido del trabajador:");
            String apellido = sc.next();
            System.out.println("Ingrese el DNI del trabajador:");
            String dni = sc.next();
            System.out.println("Ingrese la edad del trabajador:");
            int edad = sc.nextInt();
            System.out.println("Ingrese la direccion del trabajador:");
            String direccion = sc.next();
            System.out.println("Ingrese la fecha de ingreso del trabajador (YYYY-MM-DD):");
            LocalDate fechaIngresoStr = LocalDate.parse(sc.next());
            System.out.println("Ingrese el sueldo base del trabajador:");
            int sueldoBase = sc.nextInt();
            trabajadores.add(new Trabajadores(nombre, apellido, dni, edad, direccion, fechaIngresoStr, sueldoBase));
        }
        return trabajadores;
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

    public LocalDate getFecha_Ingreso() {
        return fecha_Ingreso;
    }

    public void setFecha_Ingreso(LocalDate fecha_Ingreso) {
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
