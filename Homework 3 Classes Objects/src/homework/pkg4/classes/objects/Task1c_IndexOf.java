package homework.pkg4.classes.objects;

public class Task1c_IndexOf {

    public static void main(String[] arg) {

        int[] myArr = {1, 3, 4, -3, 7};
        int myDigit = 7;

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == myDigit) {
                System.out.println(i);

//            } else {
//                System.out.println("-1");
//            }
// Tozi rezultat li se iziskva ili moje da bade -1, -1, -1, -1, 4 spored primerat po-gore?
            }

        }

    }
}
