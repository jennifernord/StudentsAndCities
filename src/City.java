public class City {
    //Attributes
    private String country;
    private String name;


    //Constructor
    public City(String country, String name){
        this.country = country;
        this.name = name;
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
