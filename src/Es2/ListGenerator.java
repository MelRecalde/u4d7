package Es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListGenerator {
    public static List<Integer> generateRandomList(int N) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(101));
        }

        Collections.sort(list);
        return list;
    }
}
