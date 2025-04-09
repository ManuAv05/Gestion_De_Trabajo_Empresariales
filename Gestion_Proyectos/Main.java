import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
        // Crear un objeto de la clase Empleado
    }

    public static void menu() {
        int opcion;
        boolean siSigue = true;
        System.out.println("Bienvenido al Gestor de Proyectos");
        System.out.println("1. Crear Proyecto");
        System.out.println("2. Eliminar Proyecto");
        System.out.println("3. Modificar Proyecto");
        System.out.println("4. Listar Proyectos");
        System.out.println("5. Salir");
        opcion = sc.nextInt();
        while (siSigue) {
            switch (opcion){
                case 1:
                    System.out.println("Nombre del Proyecto:");
                    String nombre = sc.nextLine();
                    System.out.println("Descripcion del Proyecto:");
                    String descripcion = sc.nextLine();
                    System.out.println("Estado del Proyecto:");
                    String estado = sc.nextLine();
                    System.out.println("Fecha de Inicio (YYYY-MM-DD):");
                    String fechaInicio = sc.nextLine();
                    System.out.println("Fecha de Fin (YYYY-MM-DD):");
                    String fechaFin = sc.nextLine();
                    //Para la lista de Personas necesitamos un array o una lista que debemos crear antes, o incluir en alguna
                    //de las clases un atributo que sea una lista y llamarlo desde ahí
                    new Proyecto(nombre, descripcion, null, estado, fechaInicio, fechaFin);
                    break;
                case 2:
                    System.out.println("Escriba el nombre del proyecto a eliminar:");
                    String nombreEliminar = sc.nextLine();
                    Proyecto.eliminarProyecto(nombreEliminar);
                    break;
                case 3:
                    System.out.println("Escriba el nombre del proyecto a modificar:");
                    String nombreModificar = sc.nextLine();
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
                case 4:
                    System.out.println("Lista de Proyectos:");
                    System.out.println(Proyecto.getListaProyectos());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    siSigue = false;
                    break;
            }
        }


    }
}
