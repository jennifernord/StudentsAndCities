import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Students
        ArrayList<Student> Students = new ArrayList<>();

        Students.add(new Student("Lonke", 6969));
        Students.add(new Student("Sebastian", 1337));
        Students.add(new Student("Axel", 2000));

        for(Student student : Students){
            System.out.println("Student is named: " +student.getName());
            student.addCity();
            System.out.println(student.getName() +" lives in " +student.getHometown().getName());
        }

        //Teachers
        ArrayList<Teacher> Teachers = new ArrayList<>();

        Teachers.add(new Teacher("Karen"));
        Teachers.add(new Teacher("Calle"));

        for (Teacher teacher : Teachers){
            teacher.addCourse();
            System.out.println("Teacher has name " +teacher.name +" and is teaching " +teacher.course.getCourse());
        }
    }
}