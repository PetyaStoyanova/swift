package homework.pkg4.classes.objects;

public class Digit {

    int firstDigit;
    int secondDigit;

    Digit(int firstDigit, int secondDigit) {
        this.firstDigit = firstDigit;
        this.secondDigit = secondDigit;

    }

    boolean isEqual() {

        if (firstDigit == secondDigit) {
            return true;
        }

        return false;

    }

    String getInfo() {
        String info = String.format("Your first digit is %d and your second digit is %d.", firstDigit, secondDigit);//The statement in "" can be deleted to be compliant with the conditions in the task.

        if (this.isEqual()) {
            info += "true";
        } else {
            info += "false";
        }

        return info;
    }

}
