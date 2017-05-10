package review;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task1_UniqueNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt();
        }
        Set<Integer> sortedSet = new TreeSet<>();

        Integer[] myArray = new Integer[arr.length];

        for (int ctr = 0; ctr < arr.length; ctr++) {
            myArray[ctr] = Integer.valueOf(arr[ctr]);
            sortedSet.addAll(Arrays.asList(arr[ctr]));
        }
        printSet(sortedSet);
    }

    private static void printSet(Set<Integer> set) {
        System.out.println(set.getClass().toString());

        for (Integer i : set) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
