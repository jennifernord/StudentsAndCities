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
    public void addCity(){
        System.out.println("What city does the student live in? : ");
        String cityName = scan.nextLine();
        this.hometown = new City("Sweden", cityName, this);
    }

    public String reportBuddyName(){
        return name;
    }

    public Student getBuddy() {
        return buddy;
    }

    public String getName() {
        return this.name;
    }

    public int getStudentId(){
        return studentId;
    }

    public City getHometown(){
        return hometown;
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
