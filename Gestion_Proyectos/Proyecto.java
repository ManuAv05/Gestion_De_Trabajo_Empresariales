import java.util.Arrays;
import java.util.List;

public final class Proyecto {
    private String nombre;

    private String descripcion;

    private String[] lista_personas;

    private String estado_proyecto;

    private String fecha_inicio;

    private String fecha_fin;

    public Proyecto(final String nombre, final String descripcion, final List<String> lista_personas, final String estado_proyecto, final String fecha_inicio, final String fecha_fin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.lista_personas = lista_personas.toArray(new String[0]);
        this.estado_proyecto = estado_proyecto;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String[] getLista_personas() {
        return lista_personas;
    }

    public void setLista_personas(String[] lista_personas) {
        this.lista_personas = lista_personas;
    }

    public String getEstado_proyecto() {
        return estado_proyecto;
    }

    public void setEstado_proyecto(String estado_proyecto) {
        this.estado_proyecto = estado_proyecto;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", lista_personas=" + Arrays.toString(lista_personas) +
                ", estado_proyecto='" + estado_proyecto + '\'' +
                ", fecha_inicio='" + fecha_inicio + '\'' +
                ", fecha_fin='" + fecha_fin + '\'' +
                '}';
    }
}
