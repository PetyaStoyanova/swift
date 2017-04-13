package homework.pkg4.classes.objects;

import java.util.ArrayList;

public class IndexOf {

    int myDigit;
    int[] myArr;

    IndexOf(int myDigit, int[] myArr) {

        this.myDigit = myDigit;
        this.myArr = myArr;

    }

    int getIndexOf() {

        int indexOf = 0;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == myDigit) {
                indexOf += i;

            }

            return indexOf;

        }
        return getIndexOf();

    }
}
