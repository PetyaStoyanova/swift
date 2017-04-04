/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg2.arrays.strings;

import java.util.Scanner;

/**
 *
 * @author Mickey mouse
 */
public class Task1d_PrintString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (char c : str.toCharArray()) {

            System.out.println(c);

        }

    }
}
