import java.util.Date;

public class Account {
    private String id;
    private Address billing_address;
    private boolean is_closed;
    private Date open;
    private Date closed;

    private ShoppingCart cart;
    private Order[] orders;
    private int order_size = 0;
    private static int identity = 0;

// The following method takes in a variable and converting it onto a string for an ID
    private static String identification() {
        return Integer.toString(identity++);
    }

//Constructor
    public Account(){
        this.id = identification();
        this.billing_address = new Address();
        this.is_closed = false;
        this.open = new Date();
        this.cart = new ShoppingCart();
        this.orders = new Order[100];
    }

//The following constructor's takes in values via parameters
    public Account(String web_login_id ){
        this.id = web_login_id;
        this.billing_address =  new Address();
        this.is_closed = false;
        this.open = new Date();
        this.cart = new ShoppingCart();
        this.orders = new Order[100];
    }

    public Account(String web_login_id , Address accountAddress){
        this.id = web_login_id;
        this.billing_address = accountAddress;
        this.is_closed = false;
        this.open = new Date();
        this.cart = new ShoppingCart();
        this.orders = new Order[100];
    }

//Getters
    public String getId(){
        return this.id;
    }

    public Address getBillingAddress(){
        return this.billing_address;
    }

    public Order[] getOrders(){
        return this.orders;
    }

    public int getOrder_size() {
        return this.order_size;
    }

    public ShoppingCart getCart(){
        return this.cart;
    }

//setters
    public void setId(String i){
        this.id = i;
    }

    public void setBillingAddress(Address temp_add){
        this.billing_address = temp_add;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

//A method that will remove lineItems from customer's shopping cart
    public Order customOrder(){
        Order currentOrder = new Order();
        currentOrder.convertingCartToOrder(this);
        orders[order_size] = currentOrder;
        order_size++;
        return currentOrder;
    }

//The following will close the account
    public void closeAccount(){
        this.closed = new Date();
        is_closed = true;
    }

    public String toString() {
        return "\nAccount ID: " + id + "\nAddress: " + billing_address + "\nOrder Size: " + order_size + "\nAccount Open Date: " + open + "\nAccount Close Date: " + closed + "\n---------";

    }

}
