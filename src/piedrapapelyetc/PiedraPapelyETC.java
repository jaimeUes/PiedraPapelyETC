/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piedrapapelyetc;
import java.util.Random;
import java.util.Scanner;

public class PiedraPapelyETC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elije: piedra, papel, tijeras, lagarto o Spock");
        String eleccionJugador = scanner.nextLine().toLowerCase();

        String[] opciones = {"piedra", "papel", "tijeras", "lagarto", "spock"};
        String eleccionComputadora = opciones[new Random().nextInt(opciones.length)];

        System.out.println("Jugador elige: " + eleccionJugador);
        System.out.println("Computadora elige: " + eleccionComputadora);

        if (eleccionJugador == eleccionComputadora) {
            System.out.println("Empate");
        } else if (
            (eleccionJugador == "tijeras" && (eleccionComputadora == "papel" || eleccionComputadora == "lagarto")) ||
            (eleccionJugador == "papel" && (eleccionComputadora == "piedra" || eleccionComputadora == "Spock")) ||
            (eleccionJugador == "piedra" && (eleccionComputadora == "lagarto" || eleccionComputadora == "tijeras")) ||
            (eleccionJugador == "lagarto" && (eleccionComputadora == "Spock" || eleccionComputadora == "papel")) ||
            (eleccionJugador == "Spock" && (eleccionComputadora == "tijeras" || eleccionComputadora == "piedra"))
        ) {
            
            System.out.println("Has Ganado!!!");
        } else {
            
            
            System.out.println("Has Perdido");
        }
    
    }
}
