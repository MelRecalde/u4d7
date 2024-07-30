package Es2;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> randomList = ListGenerator.generateRandomList(10);
        System.out.println("Sorted random list: ");
        System.out.println(randomList);

        List<Integer> reversedList = ListManipulator.listWithReverse(randomList);
        System.out.println("List with reverse");
        System.out.println(reversedList);

        System.out.println("Values at even positions: ");
        ListManipulator.printValues(reversedList, true);

        System.out.println("Values at odd positions: ");
        ListManipulator.printValues(reversedList, false);
    }
}
