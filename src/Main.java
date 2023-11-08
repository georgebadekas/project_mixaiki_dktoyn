import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for(int p = 1; p<10;p++){
            ArrayList<terminal> terminals = new ArrayList<>();
            for(int i = 0; i < 8;i++){
                terminals.add(new terminal(i));
            }
            for(int i = 1; i<300001;i++){
                for(int j = 0; j < 8; j++){
                    Random random = new Random();
                    terminals.get(j).chance_of_transmit = random.nextFloat();
                }

            }
        }
    }
}