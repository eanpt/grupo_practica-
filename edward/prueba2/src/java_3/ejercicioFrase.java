package java_3;

import java.util.Scanner;

public class ejercicioFrase {
   public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa una frase: ");
        String phrase = leer.nextLine();
        
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());
    }
}


