package lab12.test;

import lab12.threads.AVGThread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class TestThreadMap {

    public static void main(String[] args) {

        TestThreadMap app = new TestThreadMap();
        app.startApp();

    }
    private void startApp() {
        System.out.println("Введіть кількість ключів n:\n");
        int n = 3;
//        Random rnd = new Random();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
            ArrayList<Integer> rnd_int_list_1 = new ArrayList<>();
            ArrayList<Integer> rnd_int_list_2 = new ArrayList<>();
            ArrayList<Integer> rnd_int_list_3 = new ArrayList<>();
            rnd_int_list_1.add(0);
            rnd_int_list_2.add(0);
            rnd_int_list_2.add(7);
            rnd_int_list_3.add(1);
            map.put(0, rnd_int_list_1);
            map.put(1, rnd_int_list_2);
            map.put(2, rnd_int_list_3);
        map.entrySet().forEach(System.out::println);

        ArrayList<Integer> avg_list = new ArrayList<>();

        for(int i = 0; i < n;i++) {
            Thread thread1 = new Thread(new AVGThread(map.get(i),avg_list));
            thread1.start();
            try {
                thread1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for (int i = 0; i < avg_list.size(); i++) {
            System.out.println(i + " = " + avg_list.get(i));
        }

    }
}

