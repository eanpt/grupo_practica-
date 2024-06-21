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
            System.out.println("4. match 4");
            System.out.println("5. par o impar 5");
            System.out.println("6. EUREKA 6");
            System.out.println("7. length 7 ");
            System.out.println("8. Substring 8");
         
            System.out.println("10. Salir");
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
                    System.out.println("ingrese un numero");
                    int n7 = scanner.nextInt();
                    int doble = (n7 * 2);
                    int triple = (n7 * 3);
                    System.out.println("el doble del numero es " + doble);
                    System.out.println("el triple del numero es " + triple);
                    System.out.println("la raiz cuadrada de el numero ingresado es " + Math.sqrt(n7));
                    break;
                case 5:
                    System.out.println("ingrese un numero");
                    int n8 = scanner.nextInt();
                    if (n8 % 2 == 0) {
                        System.out.println("tu numero es par");

                    } else {
                        System.out.println("tu numero es impar");
                    }
                  break;
                  
                  case 6:
                  System.out.println("la opcion que escogiste es la 6 :");
                     System.out.println("ingrese una frase ");
                     scanner.nextLine();
                   String frase = scanner.nextLine().toLowerCase();
                   if (frase.equals("eureka")) {
                    System.out.println("¡Eureka! Has encontrado la frase :"+ frase );
                    
                  } else {
                    System.out.println("no has encontrado,la frase");
                    
                  }
                     break;
                     case 7:
                     System.out.println("la opcion que escogiste es la 7 :");
                     System.out.println("ingrese una frase :");
                     scanner.nextLine();
                     String frase2 = scanner.nextLine();
                     if (frase2.length()==8) {
                         System.out.println("tu frase es correcta");
                     } else {
                        System.out.println("tu frase no es correcta");
                     }
                     break;
                     case 8:
                     System.out.println("la opción que escogiste es la 8");
                     System.out.println("Ingrese una frase: ");
                     scanner.nextLine();
                     String oracion = scanner.nextLine();  
                     String inicial = oracion.substring(0,1);                              
                     if (inicial.equals("A") ){
                         System.out.println("Correcto");
                     } else {
                        System.out.println("Incorrecto");
                     }
                  
                    break;



                default:

                    System.out.println("Opción inválida. Intente de nuevo.");

            }


        } while (opcion != 10);


    }
}
