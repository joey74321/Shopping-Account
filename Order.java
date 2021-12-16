import java.util.Date;

public class Order{

    private String number;
    private int order_size;
    private static int identity = 0;
    private double total;
    private Address ship_to;
    private Date ordered;
    private Date shipped;
    private LineItem[] lineItems;
    private OrderStatus status;
    private Payment[] payment;
    private int paymentSize;

// The following method takes in a variable and converting it onto a string for an ID
    private static String identification() {
        return Integer.toString(identity++);
    }


    //constructor
    public Order(){
        this.number = identification();
        this.ordered = new Date();
        this.status = OrderStatus.New;
        this.order_size = 0;
        this.lineItems = new LineItem[100];
        this.payment = new Payment[100];
    }

//getters
    public String getNumber() {
        return this.number;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

//setters
    public void setClosed() {
        this.status = OrderStatus.Closed;
    }

    public void setDelivered() {
        this.status = OrderStatus.Delivered;
    }

    public void setHold() {
        this.status = OrderStatus.Hold;
    }

    public void setShipped() {
        this.status = OrderStatus.Shipped;
    }

//The following will add LineItem to an order
    public void addLineItem(LineItem product) {
        lineItems[order_size] = product;
        order_size++;
        total += product.getTotalPrice();
    }

//The following will add a payment to an order
    public void addPayment(Payment value){
        payment[paymentSize] = value;
        paymentSize++;
    }


//The customer's shopping cart will be converted into an order
    public void convertingCartToOrder(Account customerAccount) {
        //shipping to billing address
        ship_to = customerAccount.getBillingAddress();
        ShoppingCart cart = customerAccount.getCart();
        for (int i = 0; i < cart.getSize(); i++){
            addLineItem(cart.getItems()[i]);
        }
        //emptying the cart
        cart.emptyCart();
    }

    public String toString() {
        StringBuilder out = new StringBuilder("The order #: " + number + "\nStatus: " + status + "\nShipping Address: " + ship_to + "\nYour total: " + total + "\n");

        for(int i = 0; i < order_size; i++) {
            out.append(lineItems[i]).append("\n");
        }

        out.append("The following payments: \n");
        if(paymentSize != 0 ){
            for(int i = 0; i < paymentSize; i++) {
                out.append(payment[i]).append("\n");
            }
        } else {
            out.append("No payments \n");
        }

        return out.toString();
    }
}

