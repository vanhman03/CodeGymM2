import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (anhnb (anhnbt.it@gmail.com))
 * Date: 2025/01/08
 * Time: 19:38 PM
 */
public class MinArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers; // Khai báo mảng số nguyên
        System.out.println("Enter a size of array: ");
        int SIZE = scanner.nextInt();
        numbers = new int[SIZE]; // Khởi tạo mảng số nguyên với SIZE phần tử

        for (int i = 0; i < SIZE; i++) {
            System.out.println("Enter value at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        int minValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        scanner.close();
        System.out.println("Min value is: " + minValue);
    }
}