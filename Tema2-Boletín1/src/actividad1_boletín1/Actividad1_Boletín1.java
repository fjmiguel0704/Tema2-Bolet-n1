package actividad1_boletín1;

import java.util.Scanner;

public class Actividad1_Boletín1 {

	public static void main(String[] args) {
		
		//Creo las variables num y resto
		int num;
		int resto;

		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca el número 
		System.out.print("Introduce el número: ");
		
		//Declaramos la variable num, que gusrdará el número introducido por el usuario
		num = read.nextInt();
		
		//Declaramos la varibale resto, que recogerá el resto de la división de la variable num entre 2
		resto = num%2;
		
		//Uso el condicional if para decir, que si la varibale resto es igual 0, entonces devuélveme par
		if (resto == 0) {
			
			//devuélveme par
			System.out.println("par");
		}
		
		//Y en caso de que no, es decir, que sea distinto a 0, entonces devuélveme impar
		else {
			
			//devuélveme impar
			System.out.println("impar");
		}
		
		//Cierro el Scanner
		read.close();

	}

}