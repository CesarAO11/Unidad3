/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroentero;

import java.util.Scanner;
/**
 *
 * @author Cesar Rotten
 */
public class NumeroEntero {

    public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);

int numero= 0;

     System.out.println("Indique un número: ");

numero = input.nextInt();

if ((numero % 2) == 0){

     System.out.println(numero + "es par");

}else{

     System.out.println(numero+ "es impar");
    }
    }
}
