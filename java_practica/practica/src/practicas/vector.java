package practicas;

import java.util.Scanner;

public class vector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el tamaño del cuadrado");
            
                int N = sc.nextInt() ; // Puedes cambiar este valor para diferentes tamaños de cuadrados

                dibujarCuadrado(N);
            }
        
            public static void dibujarCuadrado(int N) {
                if (N < 2) {
                    System.out.println("El tamaño mínimo del cuadrado es 2.");
                    return;
                }
        
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            }
        }
        
    



