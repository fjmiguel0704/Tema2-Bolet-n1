package actividad4_boletín1;

import java.util.Scanner;

public class Actividad4_Boletín1 {

	public static void main(String[] args) {
		
		//Creo las variables num1 y num2, que contendrán los datos a ordenar de menor a mayor
		int num1;
		int num2;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca el primer número
		System.out.print("Inroduce el primer número: ");
		
		//Declaramos la variable num1, que será el primer dato que ingrese el usuario
		num1 = read.nextInt();
		
		//Le pedimos al usuario que introduzca el segundo número
		System.out.print("Introduce el segundo número: ");
		
		//Declaramos la variable num2, que será el segundo dato que ingrese el usuario
		num2 = read.nextInt();
		
		//Mediante condicionales, vamos a indicar, que si el valor de num1 es menor a num2
		if (num1 < num2) {
			
			//Le muestre al usuario por consola, primero num1 (valor menor) y luego num2 (valor mayor)
			System.out.print(num1 + ", " + num2);
		}
		
		//Y en caso contrario, si es menor num2 a num1
		else {
			
			//Le muestre al usuario, primero num2 y luego num1
			System.out.print(num2 + ", " +num1);
		}
		
		//Cerramos el Scanner
		read.close();

	}

}
