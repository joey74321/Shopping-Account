public class Product {
    private String id;
    private String name;
    private TheSupplier supplier;
    private static int identity = 0;
// The following method takes in a variable and converting it onto a string for an ID
    private static String identification() {
         return Integer.toString(identity++);
    }

//The following constructor takes in values via parameters
    public Product(String someName,  TheSupplier someSupplier){
        this.id = identification();
        this.name = someName;
        this.supplier = someSupplier;
    }
    public String toString() {
        return  id + " (" + name + " from " + supplier + ")";
    }



}
