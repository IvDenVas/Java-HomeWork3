import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите длину списка: ");
        int count = iScanner.nextInt();
        iScanner.close();
        int sum = 0;

        for (int i = 0; i < count; i++) {
            numbers.add((int) (Math.random() * 100));
        }

        for (int i : numbers) {
            sum += i;
        }

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.print("Минимальный элемент: ");
        System.out.println(numbers.toArray()[0]);
        System.out.print("Максимальный элемент: ");
        System.out.println(numbers.toArray()[count - 1]);
        System.out.print("Среднее арифметическое элементов: ");
        System.out.println(sum / count);
    }
}
