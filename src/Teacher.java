import java.util.Scanner;

public class Teacher {
    //attributes
    String name;
    int tel;
    Course course;

    //constructor
    public Teacher(String name, int tel, Course course){
        this.name = name;
        this.tel = tel;
        this.course = course;
    }

    //methods
    public void addCourse(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What course? : ");
        String courseName = scan.nextLine();
        this.course = new Course(courseName, this);
    }
}
