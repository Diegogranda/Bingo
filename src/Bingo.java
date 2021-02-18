import java.util.ArrayList;

public class Bingo {
    public static void main(String[] args) {
        Jugadores jugador=new Jugadores();
        Jugadores Jugador2=new Jugadores();
        jugador.completar();
        Jugador2.completar();
        Generador_de_bolas generar=new Generador_de_bolas();
        generar.jugar(jugador,Jugador2);
    }

}
