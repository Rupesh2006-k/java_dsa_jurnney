package oops;

//blueprint / class
public class StudentUpgrade {
    //    instance variable
    String name;
    int age;

    //    constructor
    StudentUpgrade() {
        System.out.println("hello hello ");
    }

    // method                 , local variable
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //    print method
    public void print() {
        System.out.println("Name : " + name + " " + " Age : " + age);

    }
}


//object
class Temp {
    public static void main(String[] args) {
//        StudentUpgrade s1 = new StudentUpgrade();
//        s1.name = "Rupesh";
//        s1.age = 20;

        StudentUpgrade s1 = new StudentUpgrade();
        s1.initialize("Rupesh", 20);
        s1.print();
        StudentUpgrade s2 = new StudentUpgrade();
        s2.initialize("gole", 21);
        s2.print();
        StudentUpgrade s3 = new StudentUpgrade();
        s3.initialize("bholu", 15);
        s3.print();
    }
}
