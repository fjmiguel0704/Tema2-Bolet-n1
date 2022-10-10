package actividad5_boletín1;

import java.util.Scanner;

public class Actividad5_Boletín1 {

	public static void main(String[] args) {
		
		//Creo tres variables, num1, num2 y num3. Guardarán los valores introducidos por el usuario
		int num1;
		int num2;
		int num3;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca el primer número
		System.out.print("Introduce el primer número: ");
		
		//Declaramos la variable num1, que guardará el primer dato introducido por el usuario
		num1 = read.nextInt();
		
		//Le pedimos al usuario que introduzca el segundo número
		System.out.print("Introduce el segundo número: ");
		
		//Declaramos la variable num2, que guardará el segundo dato introducido por el usuario
		num2 = read.nextInt();
		
		//Le pedimos al usuario que introduzca el tercer número
		System.out.print("Introduce el tercer número: ");
		
		//Declaramos la variable num3, que guardará el tercer dato introducido por el usuario
		num3 = read.nextInt();
		
		//Mediante condicionales, indicamos, que si el valor de la variable num1 es mayor al de num2 y el de num2 mayor a num3
		if (num1 > num2 && num2 > num3) {
			
			//Imprima que el número 1 es mayor al número 2, y el número 2 mayor al número 3
			System.out.print(num1 + ", " +num2 + ", " + num3);
		}
		
		//En caso contrario, si num1 es mayor a num3 y num3 mayor a num2
		else if (num1>num3 && num3>num2){
			
				//Imprima que el número 1 es mayor al número 3, y el número 3 mayor al número 2
				System.out.print(num1 + ", " + num3 + ", "+ num2);
			}
			
			//En caso contrario, si num2 es mayor a num1 y num1 mayor a num3
			else if (num2>num1 && num1>num3){
				
					//Imprima que el número 2 es mayor al número 1, y el número 1 mayor al número 3
					System.out.print(num2 + ", " +num1 +", "+ num3);
				}
		
				//En caso contrario, si num2 es mayor a num3 y num3 mayor a num1
				else if (num2>num3&&num3>num1) {
					
						//Imprima que el número 2 es mayor al número 3, y el número 3 mayor al número 1
						System.out.print(num2 + ", " +num3 +", "+ num1);
					}
		
					//En caso contrario, si num3 es mayor a num1 y num1 mayor a num2
					else if(num3>num1&&num1>num2){
						
							//Imprima que el número 3 es mayor al número 1, y el número 1 mayor al número 2
							System.out.print(num3 + ", " +num1 +", "+ num2);
						}
		
						//En caso contrario, si num3 es mayor a num2 y num2 mayor a num1
						else if(num3>num2&&num2>num1){
							
								//Imprima que el número 3 es mayor al número 2, y el número 2 mayor al número 1
								System.out.print(num3 + ", " +num2 +", "+ num1);
							}
		
		//Cerramos el Scanner
		read.close();
		
		}
	}

	
	


