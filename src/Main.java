import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Cities
        City City1 = new City("Sweden", "Stockholm");
        City City2 = new City("Sweden", "Täby");

        //Students
        ArrayList<Student> Students = new ArrayList<>();

        Students.add(new Student("Lonke", 6969));
        Students.add(new Student("Sebastian", 1337));
        Students.add(new Student("Axel", 2000));

        for(Student student : Students){
            System.out.println("");
        }

        Student Student1 = new Student("Lonke", 6969);
        Student Student2 = new Student("Sebastian", 1337);
        Student Student3 = new Student("Axel", 2000);

        //Set
        Student1.setHometown(City1);
        Student2.setHometown(City2);
        Student3.setHometown(City2);

        Student1.setBuddy(Student3);
        Student2.setBuddy(Student1);
        Student3.setBuddy(Student2);

        System.out.println("Students are named " +Student1.getName() +", " +Student2.getName() +" and " +Student3.getName());
        System.out.println("In " +City1.getName() +": " +Student1.getName());
        System.out.println("In " +City2.getName() +": " +Student2.getName() +" and " +Student3.getName());

        //Teachers
        ArrayList<Teacher> Teachers = new ArrayList<>();

        Teachers.add(new Teacher("Karen"));
        Teachers.add(new Teacher("Calle"));

        for (Teacher teacher : Teachers){
            teacher.addCourse();
            System.out.println("Teacher has name " +teacher.name +" and has course " +teacher.course.getCourse());
        }
    }
}