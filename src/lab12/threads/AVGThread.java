package lab12.threads;

import java.util.ArrayList;
import java.util.List;

public class AVGThread implements Runnable {

    ArrayList<Integer> list;
    List<Integer> avg;

    public AVGThread(ArrayList<Integer> list, List<Integer> avg) {
        this.list = list;
        this.avg = avg;
    }

    @Override
    public void run() {
        int sum = 0;
            for (Integer integer : list) {
                sum += integer;
            }
            avg.add(sum/list.size());
    }

}
