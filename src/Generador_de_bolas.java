import java.util.ArrayList;

public class Generador_de_bolas {
    boolean victoria = false;
    ArrayList<Integer> numero = new ArrayList<>(100);
    int bola;
    public void generador() {
        boolean repetido=false;
        do{
            bola = ((int) (Math.random() * 100));
            if (numero.contains(bola)) repetido=true;
            else repetido=false;
        }
        while (repetido);
        numero.add(bola);
        System.out.println(" ");
        System.out.println("El número es: " + bola);
    }

    public void jugar(Jugadores jugador ,Jugadores jugador2){
        while (!victoria) {
            if (jugador.cartulina.size() != 0 && jugador2.cartulina.size() != 0) {
                generador();
            } else System.out.println("Hay un error");
            if (jugador.cartulina.contains(bola)) {
                jugador.cartulina.remove(jugador.cartulina.indexOf(bola));
                System.out.println("El jugador 1 tiene el número que ha salido ");
            } else System.out.println("El jugador 1 no tiene el número que ha salido");
            if (jugador2.cartulina.contains(bola)) {
                jugador2.cartulina.remove(jugador2.cartulina.indexOf(bola));
                System.out.println("El jugador 2 tiene el número que ha salido");
            } else System.out.println("El jugador 2 no tiene el número que ha salido");

            if (jugador.cartulina.size()==0 && jugador2.cartulina.size()==0){
                System.out.println("\nGanan los dos");
                victoria = true;
            } else if (jugador.cartulina.size()==0){
                System.out.println("\n Ha ganado el jugador 1");
                victoria = true;
            } else if(jugador2.cartulina.size()==0){
                System.out.println("\nHa ganado el jugador 2");
                victoria = true;
            }else System.out.println("\nContinuamos jugando");
        }

    }
}