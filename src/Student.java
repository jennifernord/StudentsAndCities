import java.util.Scanner;

public class Student {
    //attributes
    Scanner scan = new Scanner(System.in);
    private String name;
    private int studentId;
    private Student buddy;
    private City hometown;


    //Constructor
    public Student(String name, int studentId){
        this.name = name;
        this.studentId = studentId;
    }


    //Methods
    public String reportBuddyName(){
        return buddy.getName();
    }

    public void student(int studentId, String name){
        System.out.println("Enter student name: ");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        System.out.println("Enter student ID: ");
        studentId = scan.nextInt();
    }

    public Student getBuddy() {
        return buddy;
    }

    public String getName() {
        return name;
    }

    public int getStudentId(){
        return studentId;
    }

    public void setBuddy(Student buddy){
        this.buddy = buddy;
    }

    public void setHometown(City hometown){
        this.hometown = hometown;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStudentId(int StudentId){this.studentId = studentId; }
}
