package homework.pkg2.arrays.strings;


import java.util.Scanner;

public class Task1d_PrintString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (char c : str.toCharArray()) {

            System.out.println(c);

        }

    }
}
