package actividad9_boletín1;

import java.util.Scanner;

public class Actividad9_Boletín1 {

	public static void main(String[] args) {
		int piedra = 0;
        int papel = 1;
        int tijeras = 2;
        int jugador1;
        int jugador2;
        Scanner read = new Scanner (System.in);
        System.out.print("¿Piedra = 0, Papel = 1 o Tijeras = 2?: ");
        jugador1 = read.nextInt();
        System.out.print("¿Piedra = 0, Papel = 1 o Tijeras = 2?: ");
        jugador2 = read.nextInt();

        if(jugador1==piedra && jugador2==papel) {
            System.out.print("Papel gana a piedra. ¡Ganador Jugador 2!");
        } else if(jugador1==piedra && jugador2==tijeras) {
            System.out.print("Piedra gana a tijeras. ¡Ganador Jugador 1!");
        } else if (jugador1==papel && jugador2==tijeras) {
            System.out.print("Tijeras gana a Papel. ¡Ganador Jugador 2!");
        } else if (jugador1==papel && jugador2==piedra) {
            System.out.print("Papel gana a Piedra. ¡Ganador Jugador 1!");
        } else if (jugador1==tijeras && jugador2==piedra) {
            System.out.print("Piedra gana a Tijeras. ¡Ganador Jugador 2!");
        } else if (jugador1==tijeras && jugador2==papel) {
            System.out.print("Tijeras gana a Papel. ¡Ganador Jugador 1!");
        }

	}

}
