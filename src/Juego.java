package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */


public class Juego {

    public static void main(String args[]) {
        Jugador p1 = new Jugador();
        Jugador p2 = new Jugador();
        boolean finDeJuego = false;
        Integer rondasJugadas = 0;    // Número de rondas jugadas
        Integer exitosJugador1 = p1.exitos;
        Integer exitosJugador2 = p2.exitos;
        Integer empates = 0;
        String opcionJugador1;
        String opcionJudador2;
        
        // Bucle de juego
        do {
            System.out.println("***** Ronda: " + rondasJugadas + " *********************\n");
            System.out.println("Numero de empates: " + empates + "\n");
            opcionJugador1 = p1.opcionAlAzar();
            System.out.println("Jugador 1: " + opcionJugador1 + "\t Jugador 1 - Partidas ganadas: " + exitosJugador1);
            opcionJudador2 = p2.opcionAlAzar();
            System.out.println("Jugador 2: " + opcionJudador2+ "\t Jugador 2 - Partidas ganadas: " + exitosJugador2);
            
            if ((opcionJugador1.equals("piedra")) && (opcionJudador2.equals("papel"))) {
                System.out.println("Jugador 2 GANA");
                exitosJugador2 = ++p2.exitos;
                
            }
            else if ((opcionJugador1.equals("papel")) && (opcionJudador2.equals("piedra"))) {
            	exitosJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if ((opcionJugador1.equals("piedra")) && (opcionJudador2.equals("tijeras"))) {
            	exitosJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if ((opcionJugador1.equals("tijeras")) && (opcionJudador2.equals("piedra"))) {
            	exitosJugador2 = ++p2.exitos;
                System.out.println("Jugador 2 GANA");
            }
            else if ((opcionJugador1.equals("tijeras")) && (opcionJudador2.equals("papel"))) {
            	exitosJugador1 = ++p1.exitos;
                System.out.println("Jugador 1 GANA");
            }
            else if ((opcionJugador1.equals("papel")) && (opcionJudador2.equals("tijeras"))) {
            	exitosJugador2 = ++p2.exitos;
                System.out.println("Jugador 2 GANA");
            }
            if (opcionJugador1 == opcionJudador2) {
            	empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            rondasJugadas++;

            if ((p1.exitos >= 3) || (p2.exitos >= 3)) {
            	finDeJuego = true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();

        } while (finDeJuego != true);
    }
}