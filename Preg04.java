package javaapplication1;

import java.util.Scanner;

public class Preg04 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Numero: ");
        int num=sc.nextInt();  
        if(Perfecto(num)==true)
             System.out.println("Numero perfecto");
        else 
             System.out.println("Numero imperfecto");
        
    }
    
   public static boolean Perfecto(int n){
       int total=0;
       for (int i = 1; i <= n; i++) {
       if(n%i==0){
           total = total +i;
           
       }
       if(total==n)
           return true;}
       
       return false;
   }
}
