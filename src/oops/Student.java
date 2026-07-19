//blueprint / class
public class Student {
    //    instance variable
    String name;
    int age;

    //    constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name) {
        this.name = name;
    }

    // method                 , local variable
//    public void initialize(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    //    print method
    public void print() {
        System.out.println("Name : " + name + " " + " Age : " + age);

    }
}


//object
class Temp {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.name = "Rupesh";
//        s1.age = 20;

        Student s1 = new Student("Rupesh", 20);
        s1.print();
        Student s2 = new Student("gole", 21);
        s2.print();
        Student s3 = new Student("bholu", 15);
        s3.print();

        Student s4 = new Student("bholu");
        s4.print();
    }
}