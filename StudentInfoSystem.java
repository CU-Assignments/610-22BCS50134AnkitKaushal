import java.util.Scanner;

abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayDetails();
}

class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Student Details:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Age: ");
        int studentAge = scanner.nextInt();
        System.out.print("Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.println("Enter Teacher Details:");
        System.out.print("Name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Age: ");
        int teacherAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Subject: ");
        String subject = scanner.nextLine();
        scanner.close();
        
        Student student = new Student(studentName, studentAge, rollNumber);
        Teacher teacher = new Teacher(teacherName, teacherAge, subject);
        
        System.out.println();
        student.displayDetails();
        System.out.println();
        teacher.displayDetails();
    }
}