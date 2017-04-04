/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg2.arrays.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mickey mouse
 */
public class Task1c_ReadArray {

    /**
     * @param args the command line arguments
     */
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
