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
public class AreaRectangulo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner lecturaDatos = new Scanner(System.in);
   System.out.println("Ingrese la base");;
   int base = lecturaDatos.nextInt();
        System.out.println("Ingrese la altura");;
        int altura = lecturaDatos.nextInt();
        
        int area = (base*altura);
        System.out.println("El area: " + area);
        lecturaDatos.close();
    }
    
}
