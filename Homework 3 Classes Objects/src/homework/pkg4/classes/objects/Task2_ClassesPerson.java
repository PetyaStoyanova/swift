package homework.pkg4.classes.objects;

public class Task2_ClassesPerson {

    public static void main(String[] args) {

        Person Yanko = new Person();
        System.out.println(Yanko.name);
        System.out.println(Yanko.age);

        Person Petya = new Person("Petya");
        System.out.println(Petya.name);
        System.out.println(Petya.age);

        Person Gosho = new Person("Gosho", -5);
        System.out.println(Gosho.name);
        System.out.println(Gosho.age);

        System.out.println(Yanko.introduce());
        System.out.println(Petya.introduce());
        System.out.println(Gosho.introduce());

    }
}
