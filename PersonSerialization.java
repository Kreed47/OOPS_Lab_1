import java.io.*;
class Person implements Serializable {
    private static final long serialVersionUID = 1L;  // Version control for serialization
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonSerialization {

    public static void main(String[] args) {
        Person person = new Person("Shourya", 19);
        String fileName = "person.txt";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(person);
            System.out.println("Person object serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Person deserializedPerson = (Person) ois.readObject();

            System.out.println("\n--- Deserialized Person Object ---");
            deserializedPerson.displayPerson();
            System.out.println("\nVerification:");
            System.out.println("Same name: " + person.getName().equals(deserializedPerson.getName()));
            System.out.println("Same age: " + (person.getAge() == deserializedPerson.getAge()));

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
