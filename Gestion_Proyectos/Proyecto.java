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

}
