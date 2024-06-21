package java_3;

import java.util.Scanner;

public class ejercicioFrase {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

       /* System.out.println("Ingresa una frase: ");
        String phrase = input.nextLine();
        
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());*/

        boolean salir = false;
        int sumaCorrectos = 0;
        int sumaIncorrectos = 0;
        do{ 
      System.out.println("Realiza una entrada RS232, es decir, una entrada de 5 caracteres:");
    
          String entrada = input.nextLine();

         
     
          if (entrada.length() == 5 && entrada.substring(0,1).equals("x") && entrada.substring(4,5).equals("o") ) {
            
         
             sumaCorrectos ++  ;
     
     
          }else if (entrada.equals("&&&&&")) {
             salir = true;
             
     
     
          }else{
             sumaIncorrectos ++ ;
             System.out.println("los jodiiiii");
          }
          /*System.out.println(entrada);*/
        }while (salir == false); 
              
         System.out.println("Saliste del Sistema: Tuviste "+ sumaCorrectos + " Entradas correctas y " + sumaIncorrectos + " Entradas Incorrectas");
    }
         }

    
    



