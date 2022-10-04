package actividad2_boletín1;

import java.util.Scanner;

public class Actividad2_Boletín1 {

	public static void main(String[] args) {
		
		//Creo las variables num1 y num2
		int num1;
		int num2;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca el primer número
		System.out.print("Introduce el primer número: ");
		
		//Declaramos la variable num1, que esta guardará el dato introducido por el usuario
		num1 = read.nextInt();
		
		//Le pedimos al usuario que introduzca el segundo número 
		System.out.print("Introduce el segundo número: ");
		
		//Declaramos la variable num2, que esta guardará el segundo dato introducido por el usuario
		num2 = read.nextInt();
		
		//Uso el condicional if para decir, que si la varibale num1 es igual a num2, entonces que me devuelva "Son iguales" 
		if (num1 == num2) {
			
			//Devuélveme "Son iguales"
			System.out.println("Son iguales");
		}
		
		//Y en caso contrario, es decir, que num1 sea distinto a num2, entonces que me devuelva "No son iguales"
		else {
			
			//Devuélveme "No son iguales"
			System.out.print("No son iguales");
		}
		
		//Cierro el Scanner
		read.close();
	}

}