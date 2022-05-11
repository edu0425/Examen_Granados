
/*PEGUNTA 1 : CUSI OSCCORIMA EDGAR RAUL */
package pc1;

import java.util.Scanner;

public class Preg01 {

    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1;
        
        System.out.println("INTRODUCE UN VALOR: ");
        n1 = teclado.nextDouble();
        
        System.out.println( sumatoria(n1));
    }
    
     public static double factorial( double numero ) {
      double fact = 1;
      for( double i = 1; i <=numero; i++ ) {
         fact *= i;
      }
 
      return fact;
 
    }
     
     public static double sumatoria( double num ){
         double sum=0;
         
         for(int i=1; i<=num ; i++){
            double res = (factorial(i+2))/ (factorial(i+4));
             sum = sum + res; 
         }
         
         return sum;
     }
    
}
