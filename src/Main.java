public class Main {
    public static void main(String[] args) {
        //Cities
        City City1 = new City("Sweden", "Homotippen");
        City City2 = new City("Sweden", "Menlösa");

        //Students
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
    }
}