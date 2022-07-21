package pack;

import java.util.Random;

public class FinalArguments {


    public static void main(String[] args) {
        Random rnd = new Random();
        for(int i = 0;i<100; i++) {
            float weight = 20 + rnd.nextFloat() * 80;
            weight = (float) (Math.round(weight * 100.0) / 100.0);
//            if(weight == 100.0f)
            System.out.println(weight);
        }
    }
}
