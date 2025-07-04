class Student {
    String name;
    int age;
    int rollNo;


    void displayDetails() {
        System.out.println(name + " " + age + " " + rollNo);
    }

}

public class classes {
    public static void main(String[] args) {
        Student s1 =  new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.name = "sai";
        s1.age = 10;
        s1.rollNo = 20;
        s1.displayDetails();
        s2.name = "sai";
        s2.age = 10;
        s2.rollNo = 20;
        s2.displayDetails();
        s3.name = "sai";
        s3.age = 10;
        s3.rollNo = 20;
        s3.displayDetails();
    }
}
