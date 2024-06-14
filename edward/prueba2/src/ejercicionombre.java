
import java.util.Scanner;

public class ejercicionombre {
    public static void main(String[] args)  {
       Scanner leer = new Scanner(System.in);

System.out.println("ingresa tu nombre ");
String nombre = leer.nextLine();
System.out.println("ingresa tu apellido");
String apellido = leer.nextLine();
System.out.println("ingresa tu DNI");
int DNI = leer.nextInt();
System.out.println("tus datos son : "+ nombre +" "+ apellido + " "  +  DNI);


       
    }
}
