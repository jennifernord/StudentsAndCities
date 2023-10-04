import java.util.Scanner;

public class Student {
    //attributes
    Scanner scan = new Scanner(System.in);
    private String name;
    private int studentId;
    private String buddy;
    private String hometown;


    //Constructor
    Student(String name, int studentId, String buddy, String hometown){
        this.name = name;
        this.studentId = studentId;
        this.buddy = buddy;
        this.hometown = hometown;
    }


    //Methods
    public String reportBuddyName(){

    }

    public void student(int studentId, String name){
        System.out.println("Enter student name: ");
        name = scan.nextLine();
        System.out.println("Enter student ID: ");
        studentId = scan.nextInt();
    }

    public Student getBuddy() {

    }

    public String getName() {
        System.out.println("Enter student name: ");
        name = scan.nextLine();
        return name;
    }

    public int getStudentId(){
        System.out.println("Enter student ID: ");
        studentId = scan.nextInt();
        return studentId;
    }
}
