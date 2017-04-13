package homework.pkg4.classes.objects;

public class Person {

    String name;
    int age;

    Person() {
        this.name = "noName";
        this.age = -1;
    }

    Person(String name) {
        this.name = name;
        age = -1;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setAge(int age) {

        if (age < 0 || age > 150) {
            System.out.println("Error");
            
        }
        this.age = age;

    }

    String introduce() {
        if (age == -1 && name.equals("noName")) {
            return "I am John Doe";
        } else if (age == -1) {
            return "Hello, I am " + name;
        } else {
            return "Hello, I am " + name + ". I am " + age + " years old.";
        }
    }
}

// kak se proveriavat godinite?
