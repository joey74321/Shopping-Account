public class LineItem {
    private int quantity ;
    private double price;
    private Product product;

//parameterized constructor
    public LineItem(int many, double some_price, Product some_product){
        this.quantity = many;
        this.price = some_price;
        this.product = some_product;
    }

//getters
    public double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double getTotalPrice(){
        return this.price * this.quantity;

    }

    //setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Product: " + product.toString() + "\nQuantity: " + quantity + "\nPrice: " + price + "\nTotal: " + getTotalPrice();
    }
}
