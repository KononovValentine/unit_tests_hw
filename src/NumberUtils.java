import java.util.List;

public class NumberUtils {

    // Метод для расчета среднего значения списка чисел
    public static double calculateAverage(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }

    // Метод для сравнения средних значений двух списков чисел и вывода соответствующего сообщения
    public static String compareAverages(List<Integer> numbers1, List<Integer> numbers2) {
        double average1 = calculateAverage(numbers1);
        double average2 = calculateAverage(numbers2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
