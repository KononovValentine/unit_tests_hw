import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(10);
        list1.add(15);

        List<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(25);
        list2.add(30);

        double average = NumberUtils.calculateAverage(list1);
        double secondAverage = NumberUtils.calculateAverage(list2);

        System.out.println("Среднее значение первого списка: " + average);
        System.out.println("Среднее значение второго списка: " + secondAverage);
        System.out.println(NumberUtils.compareAverages(list1, list2));
    }
}
