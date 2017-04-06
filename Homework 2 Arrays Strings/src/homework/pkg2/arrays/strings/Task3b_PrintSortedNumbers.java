package homework.pkg2.arrays.strings;

import java.util.Scanner;
import java.util.Arrays;

public class Task3b_PrintSortedNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int arr[] = new int[input];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
