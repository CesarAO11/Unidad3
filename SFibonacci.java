package sfibonacci;
// @author Cesar Arcos Ortega

import java.util.Scanner;

public class SFibonacci {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

  System.out.println("Introduzca la cantidad de numeros para SFibonacci");
          
         int n = scanner.nextInt();
          // cerramos scanner
         scanner.close();
         
         int primerN = 0, segundoN = 1;
  
  System.out.println("Resultado de la SFibonacci con " + n + "numeros");
         for (int i = 1; i <= n; i++) {
  System.out.println(primerN + "");
         
         int siguiente = primerN + segundoN;
     primerN = segundoN;
    segundoN = siguiente;
         }
          
    }
    
}
