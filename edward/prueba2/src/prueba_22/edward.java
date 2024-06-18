package prueba_22;

import java.util.Scanner;

public class edward {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    System.out.println("ingrese los la temperatura actaul");
    int temp = leer.nextInt();
    int formula = 32+(9*temp/5);
System.out.println("la temperatura en grados fharenheit es: " + formula);

    }

}
