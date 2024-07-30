package Es2;


import java.util.ArrayList;
import java.util.List;

public class ListManipulator {
    public static List<Integer> listWithReverse(List<Integer> list) {
        List<Integer> newList = new ArrayList<>(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }

        return newList;
    }

    public static void printValues(List<Integer> list, boolean even) {
        for (int i = (even ? 0 : 1); i < list.size(); i += 2) {
            System.out.println(list.get(i));
        }
    }
}
