package homework.pkg4.classes.objects;

public class Individual {

    String name;
    int age;

    Individual(String newName, int newAge) {
        this.age = newAge;
        this.name = newName;
    }

    String getInfo() {
        String info = String.format("%s is %d years old.", name, age);
        return info;
    }

}
