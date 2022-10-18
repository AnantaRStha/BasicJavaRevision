package validating;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (Objects.isNull(name) || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
