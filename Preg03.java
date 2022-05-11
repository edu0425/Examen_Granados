package javaapplication1;

import java.util.Scanner;


public class Preg03 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Numero: ");
        int num=sc.nextInt();     
        if(Capicua(num)==true)
             System.out.println("El numero capicua");
        else 
             System.out.println("El numero no es capicua");
  
        
     
    }
    
    public static boolean Capicua(int n){
        String palabra = String.valueOf(n);
        
        for (int i = 0, j= palabra.length()-1; i <= j; i++, --j) {
            if(palabra.charAt(i) !=palabra.charAt(j)){
                
                return false;
            }
        }
        return true;
    }
    

}