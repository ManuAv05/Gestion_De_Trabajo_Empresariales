import java.util.Date;

public class Empleado extends Trabajadores {
    private String cargo;

    private String puesto_trabajo;

    public Empleado(final String cargo, final String puesto_trabajo, String nombre, String apellido, String dni, int edad, String direccion, Date fechaIngreso, int sueldoBase) {
        super(nombre, apellido, dni, edad, direccion, fechaIngreso, sueldoBase);
        this.cargo = cargo;
        this.puesto_trabajo = puesto_trabajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPuesto_trabajo() {
        return puesto_trabajo;
    }

    public void setPuesto_trabajo(String puesto_trabajo) {
        this.puesto_trabajo = puesto_trabajo;
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre + "\n" +
                        "Apellido: " + apellido + "\n" +
                        "DNI: " + DNI + "\n" +
                        "Edad: " + edad + "\n" +
                        "Direccion: " + Direccion + "\n" +
                        "Fecha de Ingreso: " + fecha_Ingreso + "\n" +
                        "Sueldo Base: " + sueldo_base + "\n" +
                        "Cargo: " + cargo + "\n" +
                        "Puesto de Trabajo: " + puesto_trabajo;
    }


}