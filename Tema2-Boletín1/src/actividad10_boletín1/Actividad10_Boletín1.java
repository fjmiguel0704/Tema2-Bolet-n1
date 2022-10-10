package actividad10_boletín1;

import java.util.Scanner;

public class Actividad10_Boletín1 {

	public static void main(String[] args) {
		
		//Creo 3 variables, en las cuales, cada una recogerá un valor introducido por el usuario
		int numero1;
        int numero2;
        int numero3;
        
        //Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
        Scanner read = new Scanner (System.in);
        
        //Le pedimos al usuario que introduzca un primer número
        System.out.print("Introduce el primer número:");
        
        //Declaramos la variable numero1, que recogerá el primer dato introducido por el usuario
        numero1 = read.nextInt();
        
        //Le pedimos al usuario que introduzca un segundo número
        System.out.print("Introduce el segundo número:");
        
        //Declaramos la variable numero2, que recogerá el segundo dato introducido por el usuario
        numero2 = read.nextInt();
        
        //Le pedimos al usuario que introduzca un tercer número
        System.out.print("Introduce el tercer número:");
        
        //Declaramos la variable numero3, que recogerá el tercer dato introducido por el usuario
        numero3 = read.nextInt();
        
        //Mediante condicionales indicaremos, que si la suma de numero1 + numero2 es igual a numero3
        if (numero1 + numero2 == numero3) {
        	
        	//Me imprima por pantalla que esa suma es igual a numero3
            System.out.println("La suma de " +numero1 + " + " + numero2 + " es igual a " + numero3);
        }
        
        //En caso contrario, si la suma de numero1 + numero3 es igual a numero2
        else if (numero1 + numero3 == numero2) {
        	
        	//Me imprima por pantalla que esa suma es igual a numero2
        	System.out.println("La suma de " +numero1 + " + " + numero3 + " es igual a " + numero2);
        } 
        
        //En caso contrario, si la suma de numero2 + numero3 es igual a numero1
        else if (numero2 + numero3 == numero1)  {
        	
        	//Me imprima por pantalla que esa suma es igual a numero1
            System.out.println("La suma de " +numero2 + " + " + numero3 + " es igual a " + numero1);
        }
        
        //Y en el caso contrario de todo lo anterior, es decir, que no se cumpla ninguna de las condiciones, me imprima el siguiente mensaje
        else {
        	System.out.print("Ninguna de la suma de dos números es el resultado del otro número");
        }
       
        //Cerramos el Scanner
        read.close();

	}

}
