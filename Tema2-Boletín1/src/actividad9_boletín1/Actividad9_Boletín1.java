package actividad9_boletín1;

import java.util.Scanner;

public class Actividad9_Boletín1 {

	public static void main(String[] args) {
		
		//Creo 3 variables constantes, piedra, papel y tijeras y les asigno a cada una un valor que nunca cambiará
		final int piedra = 0;
		final int papel = 1;
		final int tijeras = 2;
		
		//Creo otras dos variables, jugador1 y jugador2, que recogerán el valor introducido por los usuarios 
        int jugador1;
        int jugador2;
        
        //Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
        Scanner read = new Scanner (System.in);
        
        //Le pedimos al primer participante que introduzca, piedra, papel o tijeras. Teniendo en cuenta que piedra equivale a 0, papel a 1 y tijeras a 2
        System.out.print("¿Piedra = 0, Papel = 1 o Tijeras = 2?: ");
        
        //Declaramos la variable jugador1, que guardará el dato que introduzca el primer jugador. Bien será, 1, 2 o 3
        jugador1 = read.nextInt();
        
        //Le pedimos al segundo participante que introduzca, piedra, papel o tijeras. Teniendo en cuenta que piedra equivale a 0, papel a 1 y tijeras a 2
        System.out.print("¿Piedra = 0, Papel = 1 o Tijeras = 2?: ");
        
        //Declaramos la variable jugador2, que guardará el dato que introduzca el segundo jugador. Bien será, 1, 2 o 3
        jugador2 = read.nextInt();
        
        //Mediante condicionales, indicamos, que si el valor de jugador1 es igual al de jugador2
        if(jugador1==jugador2) {
        	
        	//Me imprima por pantalla que ha habido un empate entre ambos participantes
        	System.out.print("Hay Empate");
        } 
        
        //En caso contrario, si jugador1 es igual a piedra, papel o tijeras y jugador 2 a tijeras, piedra o papel
        else if (jugador1==piedra && jugador2==tijeras || jugador1==papel && jugador2==piedra || jugador1==tijeras && jugador2==papel) {
        	
        	//Me imprima que el ganador ha sido el Jugador 1
        	System.out.print("¡Ganador Jugador1!");
        }
        
        //Y en caso contrario, me imprima que el ganador ha sido el Jugador 2
        else {
        	System.out.print("¡Ganador Jugador2!");
        }
        
        
        //Cerramos el Scanner
        read.close();

	}

}
