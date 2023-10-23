public class City {
    //Attributes
    private String country;
    private String name;
    private Student Student;


    //Constructor
    City(String country, String name, Student Student){
        this.country = country;
        this.name = name;
        this.Student = Student;
    }


    //Methods
    public String getCountry(){
        this.country = country;
        return country;
    }

    public String getName(){
        this.name = name;
        return name;
    }
}
