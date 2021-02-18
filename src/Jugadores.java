import java.util.ArrayList;

public class Jugadores{
    ArrayList<Integer> cartulina = new ArrayList<>();
    public void completar(){
        boolean repetido=false;
        System.out.println("\n\nCartulina");
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 100);
            if (cartulina.contains(random)){
                i--;
            }
            else cartulina.add(random);
            System.out.print(cartulina.get(i) + " ");
        }

    }
}
