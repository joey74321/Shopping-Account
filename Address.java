import java.util.Objects;

public class Address {
    private String street;
    private String city;
    private String state;

//Constructor
    public Address(){
        street = "";
        city = "";
        state = "";
    }

//A constructor that takes in values via parameters
    public Address(String street_address, String city_address, String state_address){
        this.street = street_address;
        this.city = city_address;
        this.state = state_address;
    }

    public String toString(){
        if(Objects.equals(street, "")) {
            return "There are no address located here";
        }
        return street + ", " + city + ", " + state ;

    }
}
