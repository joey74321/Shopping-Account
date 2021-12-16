import java.util.Date;

public class ShoppingCart {
    private Date created;
    private int length;
    private LineItem[] lineItem;

//constructor
    public ShoppingCart() {
        this.created = new Date();
        this.lineItem = new LineItem[100];
        this.length = 0;
    }

//getters
    public LineItem[] getItems() {
        return this.lineItem;
    }

    public int getSize() {
        return this.length;
    }

//A method to add lineitems onto shopping cart
    public void addLineItem(LineItem i) {
        this.lineItem[length] = i;
        this.length++;
    }

//The following code will empty the cart
    public void emptyCart() {
        this.length = 0;
        this.lineItem = new LineItem[100];
    }

    public String toString() {
        StringBuilder out = new StringBuilder();
        for(int i=0; i < length; i++) {
            out.append(lineItem[i]).append("\n");
        }
        return out.toString();
    }
}