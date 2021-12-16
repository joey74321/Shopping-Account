import java.util.Scanner;

public class Customer extends Account {
    private Address address;
    private Phone phone;
    private String email;

//constructor
    public Customer(){
        super();
        this.address = new Address();
        this.phone = new Phone();
        this.email = "";
    }
//A constructor that takes in values via parameters
    public Customer( Phone customer_phone, String customer_email){
        super();
        this.address = getBillingAddress();
        this.phone = customer_phone;
        this.email = customer_email;
    }

//A constructor that takes in values via parameters
    public Customer(String webID, Phone customer_phone, String customer_email){
        super(webID);
        this.address = super.getBillingAddress();;
        this.phone = customer_phone;
        this.email = customer_email;
    }

//getters
    public String getEmail(){
        return this.email;
    }

    public Phone getPhone(){
        return this.phone;
    }

//setters
    public void setEmail(String customer_phone){
        this.email = customer_phone;
    }

    public void setShipment(Address home){
        this.address = home;
    }

    public void setPhone(Phone customer_phone){
        this.phone = customer_phone;
    }

//When customer registers as a web user
    public WebUser regWebUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a username: ");
        String user = scan.nextLine();
        System.out.println("Enter a password: ");
        String pw = scan.nextLine();
        scan.close();
        this.setId(user);
        return new WebUser(user, pw);
    }

    public String toString() {
        return "Customer " + getId() + "\nAddress: " + address + "\nPhone #: " + phone + "\nEmail: " + email + " ";
    }
}
