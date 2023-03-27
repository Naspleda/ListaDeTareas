import java.util.Scanner;

public class Main {

    /* Este programa solicita al usuario que ingrese cinco tareas,
    las almacena en una matriz y luego muestra todas las tareas en la pantalla.
    Aquí se asume que cada tarea es una cadena de texto.*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tareas = new String[5];

        // Agregar tareas
        for (int i = 0; i < tareas.length; i++) {
            System.out.print("Ingrese la tarea " + (i+1) + ": ");
            tareas[i] = sc.nextLine();
        }

        // Mostrar tareas
        System.out.println("Tareas:");
        for (int i = 0; i < tareas.length; i++) {
            System.out.println((i+1) + ". " + tareas[i]);
        }

        sc.close();
    }

}
