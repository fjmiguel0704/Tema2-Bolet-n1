package actividad3_boletín1;

import java.util.Scanner;

public class Actividad3_Boletín1 {

	public static void main(String[] args) {
		
		//Creo la variable num tipo float. Ya que vamos a solicitar un número con décimales
		float num;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca un número
		System.out.print("Introduce un número: ");
		
		//Declaramos la variable num, que esta recogerá el dato introducido por el usuario
		num = read.nextFloat();
		
		//Indicamos mediante condicionales, que si el valor de la variable num es mayor que -1, menor que 1 y distinto a 0
		if (num > -1 && num <1 && num != 0) {
			
			//Le muestre al usuario por consola "casi-cero"
			System.out.print("casi-cero");
		}
		
		//Y en caso contrario, de ser el valor de la variable num = 1, -1 o 0 
		else {
			
			//Le muestre al usuario que no es un número casi-cero
			System.out.print("No es casi-cero");
		}
		
		//Cerramos el Scanner
		read.close();
	
	}

}
