package practicas;

import java.util.*;

public class Practica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
do {
     
        System.out.println("Menú:");
        System.out.println("1. suma 1");
        System.out.println("2. resta 2");
        System.out.println("3. multiplicacion 3");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("opcion 1 SUMA");
                System.out.println("ingrese un numero");
                int n1 = scanner.nextInt();
                System.out.println("ingrese otro numero");
                int n2 = scanner.nextInt();
                System.out.println("la suma de los dos numeros es " + (n1 + n2));
                
                break;
            case 2:
                System.out.println("opcion 2 RESTA");
                System.out.println("ingrese un numero");
                int n3 = scanner.nextInt();
                System.out.println("ingrese otro numero");
                int n4 = scanner.nextInt();
                System.out.println("la RESTA de los dos numeros es " + (n3 - n4));
                
                break;
            case 3:
            System.out.println("opcion 3 MULTIPLICACION");
            System.out.println("ingrese un numero");
            int n5 = scanner.nextInt();
            System.out.println("ingrese otro numero");
            int n6 = scanner.nextInt();
            System.out.println("la MULTIPLICACION de los dos numeros es " + (n5 * n6));
                break;
            case 4:
                System.out.println("Adiós!");
                break;
            default:
                System.out.println("Opción inválida. Intente de nuevo.");
        }

    }while (opcion != 4);

}
}
