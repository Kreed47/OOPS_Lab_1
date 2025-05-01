class Student {
    private String name;
    private int age;


    public Student() {
        this.name = "Default Name";
        this.age = 18;
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void display() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        Student defaultStudent = new Student();
        defaultStudent.display();
        Student customStudent = new Student("Shourya", 19);
        customStudent.display();
    }
}

