/*PEGUNTA 2 : CUSI OSCCORIMA EDGAR RAUL */
package pc1;

import java.util.Scanner;

public class Preg02 {

       public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Numero: ");
        int num=sc.nextInt();     

        String number = String.valueOf(num);

        char[] digits = number.toCharArray();

        for(int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
     
        }
    }
}
