package actividad10_boletín1;

import java.util.Scanner;

public class Actividad10_Boletín1 {

	public static void main(String[] args) {
		int numero1;
        int numero2;
        int numero3;
        Scanner read = new Scanner (System.in);
        System.out.print("Introduce el primer número:");
        numero1 = read.nextInt();
        System.out.print("Introduce el segundo número:");
        numero2 = read.nextInt();
        System.out.print("Introduce el tercer número:");
        numero3 = read.nextInt();
        
        if (numero1 + numero2 == numero3) {
            System.out.println("La suma de " +numero1 + " + " + numero2 + " es igual a " + numero3);
        }
        else {
            System.out.println("La suma de " +numero1 +" + " +numero2 + " no es igual a " + numero3);
        }
        
        if (numero1 + numero3 == numero2) {
            System.out.println("La suma de " +numero1 + " + " + numero3 + " es igual a " + numero2);
        }
        else {
            System.out.println("La suma de " +numero1 +" + " +numero3 + " no es igual a " + numero2);
        }
        if (numero2 + numero3 == numero1) {
            System.out.println("La suma de " +numero2 + " + " + numero3 + " es igual a " + numero1);
        }
        else {
            System.out.print("La suma de " +numero2 +" + " +numero3 + " no es igual a " + numero1);
        }
        
        read.close();

	}

}
