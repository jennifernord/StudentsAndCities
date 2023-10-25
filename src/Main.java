import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Teachers
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Course> kurser= new ArrayList<>();

        teachers.add(new Teacher("Karen"));
        teachers.add(new Teacher("Calle"));

        for (Teacher teacher : teachers){
            kurser.add(teacher.addCourse());
            System.out.println("Teacher has name " +teacher.name
                    +" and is teaching " +teacher.course.getCourse());
        }

        //Students
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Lonke", 6969, kurser.get(0)));
        students.add(new Student("Sebastian", 1337, kurser.get(1)));
        students.add(new Student("Axel", 2000, kurser.get(1)));

        for(Student student : students){
            System.out.println("Student is named: " +student.getName());
            student.addCity();
            System.out.println(student.getName()
                    +" lives in" +student.getHometown().getName());
            System.out.println(student.getName() +" has the course " +student.);

        }
    }
}