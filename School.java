abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    abstract void performDuty();
}

class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    void performDuty() {
        System.out.println(name + " is studying.");
    }
}

class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    @Override
    void performDuty() {
        System.out.println(name + " is teaching.");
    }
}

public class School {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Student("Shourya");
        people[1] = new Teacher("Deepak");
        people[2] = new Student("Krrish");
        people[3] = new Teacher("Monika");

        for (Person person : people) {
            person.performDuty();
        }
    }
}

