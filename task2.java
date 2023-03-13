import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class task2 {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = new ArrayList<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите длину списка: ");
        int count = iScanner.nextInt();
        iScanner.close();

        for (int i = 0; i < count; i++) {
            numbers.add((int) (Math.random() * 100));
        }
        System.out.println(numbers);

        int i = 0;

        while (numbers.size() > i) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(numbers);
    }
        
} 
