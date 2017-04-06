package homework.pkg2.arrays.strings;


import java.util.Arrays;
import java.util.Scanner;

public class Task1c_ReadArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int[] arr = new int[input];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));

    }

}
