import java.util.Date;

public class Payment {
    private String id;
    private Date paid;
    private double total;
    private String details;
    private Account account;
    private static int identity = 0;

// The following method takes in a variable and converting it onto a string for an ID
    private static String identification() {
        return Integer.toString(identity++);
    }


    //The following constructor takes in values via parameters
    public Payment(Account payment, double total_items, String receipt){
        this.id = identification();
        this.paid = new Date();
        this.total = total_items;
        this.details = receipt;
        this.account = payment;
    }

    public String toString() {
        return "Account: " + account.getId() + "\nPayment ID: " + id + "\nPaid: " + paid + "\nTotal: " + total + "\nDetails: " + details;

    }
}
