
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt(); 

        if (size < 0) {
            System.out.println("Inavlid Array Size");
            return;
        }

        int[] arr = new int[size];

        for (int j = 0; j < size; j++) {
            arr[j] = sc.nextInt();
        }

        int inp = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == inp) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
