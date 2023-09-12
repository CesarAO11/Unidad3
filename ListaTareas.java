/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreriascanner;
 import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class ListaTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Esta es mi lista de tareas");
        String tarea1 = scanner.nextLine();
        System.out.println("Investiga el metodo cientifico: " + tarea1);
        String tarea2 = scanner.nextLine();
        System.out.println("resuelve los ejercicios: " + tarea2);
         String tarea3 = scanner.nextLine();
        System.out.println("Investiga que son las tics: " + tarea3);
         String tarea4 = scanner.nextLine();
        System.out.println("Calcula el area del circulo: " + tarea4);
         String tarea5 = scanner.nextLine();
        System.out.println("calcula el area del rectangulo: " + tarea5);;
    }
    
}
