import java.util.Scanner;

public class Teacher {
    //attributes
    String name;
    Course course;

    //constructor
    public Teacher(String name){
        this.name = name;
    }

    //methods
    public Course addCourse(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What course? : ");
        String courseName = scan.nextLine();

        this.course = new Course(courseName, this);
        return this.course;
    }
}
