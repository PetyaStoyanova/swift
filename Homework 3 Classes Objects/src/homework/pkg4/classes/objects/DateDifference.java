package homework.pkg4.classes.objects;


public class DateDifference {

    public static void main(String[] args) {

        SwiftDate2 x = new SwiftDate2(2016, 9, 26);
        SwiftDate2 y = new SwiftDate2(1878, 3, 3);
        SwiftDate2 x1 = new SwiftDate2(2016, 9, 26);
        SwiftDate2 y1 = new SwiftDate2(2017, 1, 1);

        System.out.println(x.getDaysDifference(y));
        System.out.println(x.getInfo());
         System.out.println(y.getInfo());

//        System.out.println(x1.getDaysDifference(y1));
//        System.out.println(y.getInfo());
    }
}
