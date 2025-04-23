import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        menu();
    }

    public static void menu() throws IOException {
        // MENU:
        int opcion;
        boolean siSigue = true;
        while (siSigue) {
            System.out.println("Bienvenido al Gestor de Proyectos");
            System.out.println("1. Crear Proyecto");
            System.out.println("2. Eliminar Proyecto");
            System.out.println("3. Modificar Proyecto");
            System.out.println("4. Listar Proyectos");
            System.out.println("5. Exportar Proyecto a JSON");
            System.out.println("6. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            // SUBMENU:
            switch (opcion) {

                //1. CREAR PROYECTO:
                case 1:
                    System.out.println("Nombre del Proyecto:");
                    String nombre = sc.nextLine();
                    System.out.println("Descripcion del Proyecto:");
                    String descripcion = sc.nextLine();
                    System.out.println("Lista de Personas");
                    List<Empleado> listaPersonas = Empleado.listasTrabajadores();
                    System.out.println("Estado del Proyecto:");
                    String estado = sc.nextLine();
                    System.out.println("Fecha de Inicio (YYYY-MM-DD):");
                    String fechaInicio = sc.nextLine();
                    System.out.println("Fecha de Fin (YYYY-MM-DD):");
                    String fechaFin = sc.nextLine();
                    new Proyecto(nombre, descripcion, listaPersonas, estado, fechaInicio, fechaFin);
                    break;

                //2. ELIMINAR PROYECTO:
                case 2:
                    System.out.println("Escriba el nombre del proyecto a eliminar:");
                    String nombreEliminar = sc.nextLine();
                    Proyecto.eliminarProyecto(nombreEliminar);
                    break;

                //3. MODIFICAR PROYECTO:
                case 3:
                    System.out.println("Escriba el nombre del proyecto a modificar:");
                    String nombreModificar = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Escriba el nuevo nombre del proyecto:");
                    String nuevoNombre = sc.nextLine();
                    System.out.println("Escriba la nueva descripcion del proyecto:");
                    String nuevaDescripcion = sc.nextLine();
                    System.out.println("Escriba el nuevo estado del proyecto:");
                    String nuevoEstado = sc.nextLine();
                    System.out.println("Escriba la nueva fecha de inicio (YYYY-MM-DD):");
                    String nuevaFechaInicio = sc.nextLine();
                    System.out.println("Escriba la nueva fecha de fin (YYYY-MM-DD):");
                    String nuevaFechaFin = sc.nextLine();
                    Proyecto.modificarProyecto(nombreModificar, nuevoNombre, nuevaDescripcion, nuevoEstado, nuevaFechaInicio, nuevaFechaFin);
                    break;

                //4. LISTAR PROYECTO:
                case 4:
                    System.out.println("Lista de Proyectos:");
                    System.out.println(Proyecto.getListaProyectos());
                    break;

                //5. EXPORTAR PROYECTO A JSON:
                case 5:
                    System.out.println("Escriba el nombre del proyecto a exportar:");
                    String nombreExportar = sc.nextLine();
                    Proyecto.exportarProyectoAJSON(nombreExportar);
                    break;

                //6. SALIR DEL PROGRAMA:
                case 6:
                    System.out.println("Saliendo...");
                    siSigue = false;
                    break;
            }
        }
    }
}