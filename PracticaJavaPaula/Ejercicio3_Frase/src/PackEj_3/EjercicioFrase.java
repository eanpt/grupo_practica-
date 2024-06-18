package PackEj_3;

import java.util.Scanner;

public class EjercicioFrase {
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresa una frase: ");
    String frase = leer.nextLine();
    System.out.println("Tu frase es: "+ frase.toUpperCase());
    System.out.println("Tu frase es: "+ frase.toLowerCase());
}
}

