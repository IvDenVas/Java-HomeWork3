import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = new ArrayList<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите длину списка: ");
        int count = iScanner.nextInt();
        iScanner.close();

        for (int i = 0; i < count; i++) {
            numbers.add((int) (Math.random() * 100));
        }
        System.out.println("До сортировки:");
        System.out.println(numbers);

        int[] arr = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            arr[i] = numbers.get(i);
        }

        mergeSort(arr, 0, arr.length - 1);
        System.out.println("После сортировки: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (right <= left) {
            return;
        }

        int mid = left + (right - left) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);

        int[] temp = Arrays.copyOf(array, array.length);

        for (int k = left; k <= right; k++) {
            temp[k] = array[k];
        }

        int i = left, j = mid + 1;
        for (int k = left; k <= right; k++) {

            if (i > mid) {
                array[k] = temp[j];
                j++;
            } else if (j > right) {
                array[k] = temp[i];
                i++;
            } else if (temp[j] < temp[i]) {
                array[k] = temp[j];
                j++;
            } else {
                array[k] = temp[i];
                i++;
            }
        }
    }
}
