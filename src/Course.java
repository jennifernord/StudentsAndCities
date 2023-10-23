import java.util.Scanner;

public class Course {
    //attributes
    private String course;
    private Teacher teacher;

    //getter
    public String getCourse() {
        return course;
    }

    //constructor
    public Course(String course, Teacher teacher){
        this.course = course;
        this.teacher = teacher;
    }
}