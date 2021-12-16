public class Main {
    public static void main(String[] args){
        blackBoxTest();
        whBoxTest();
    }
    public static void whBoxTest(){
        //The following will show a different ways to make an accounts
        System.out.println("\nCreating the following accounts");
        Address home = new Address("25800 Carlos Bee Blvd", "Hayward", "CA");
        Account accountOne = new Account("username1234", home);
        System.out.println(accountOne.getId());
        System.out.println(accountOne.getBillingAddress());
        lineSeperator();
        System.out.println(accountOne);
        System.out.println(accountOne.getCart());
        lineSeperator();
        accountOne.customOrder();
        accountOne.closeAccount();
    }
    public static void blackBoxTest() {
        //The following will show that shopping cart belongs to account (which it owns customer's orders),and the Customer doesn't need to use webuser,
        Customer[] customers = new Customer[1];
        customers[0]  = new Customer(new Phone("925", "872", "1756"), "greenLantern408@gmail.com");
        Customer tester = customers[0];
        //setting customer's ID
        tester.setId("Joey");

        System.out.println("The following products are available: ");
        Product[] products = new Product[2];
        products[0] = new Product("iPhoneX", new TheSupplier("Apple"));
        products[1] = new Product("King Size Chocolate Bar",  new TheSupplier("Hershey's"));
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("\nProducts are added onto " + tester.getId() + "'s shopping cart: ");
        Product itemOne = products[0];
        Product itemTwo = products[1];
        tester.getCart().addLineItem(new LineItem(1, 549.99, itemOne));
        tester.getCart().addLineItem(new LineItem(2, 5.99 , itemTwo));
        System.out.println(tester.getId() + " added one " + itemOne + " to cart.");
        System.out.println(tester.getId() + " added two " + itemTwo + " to cart.");
        System.out.println("\n" + tester.getId() + " has the following products in the cart: ");
        System.out.println(tester.getCart());

        //setting billing address
        tester.setBillingAddress(new Address("25800 Carlos Bee Blvd", "Hayward", "CA"));
        tester.setShipment(tester.getBillingAddress());
        System.out.println( tester.getId() + " set billing and shipping address");

        System.out.println("\n" + tester.getId() + " order finished.");
        System.out.println(tester + "\n");
        Order order = tester.customOrder();
        System.out.println(tester.getId() + "'s order: ");
        System.out.println(tester.getOrders()[0]);

        //The following will show the customer can register as a web user
        System.out.println("We are registering you as WebUser...");
        WebUser user = new WebUser();
        user.regWebUser();
        System.out.println(tester.getId() + " is registered as " + user.getId());
        lineSeperator();

        tester.getCart().addLineItem(new LineItem(1, 549.99,  itemOne));
        tester.getCart().addLineItem(new LineItem(2, 9.99,  itemTwo));
        System.out.println("\n" + tester.getId() + "'s cart: ");
        System.out.println(tester.getCart());
        System.out.println("\n" + tester.getId() + "'s is finished.");
        //Will show the customer's order history by sorting
        System.out.println(tester.getId() + "'s order history: ");
        for(int i = 0; i < tester.getOrder_size(); i++) {
            System.out.println(tester.getOrders()[i]);
        }
        lineSeperator();

        //The following will show that every payment has a unique id and one account
        Payment payment1 = new Payment(tester, 600, "Payment 1 / 2");
        Payment payment2 = new Payment(tester, 509.97, "Payment 2 / 2");
        order.addPayment(payment1);
        order.addPayment(payment2);
        System.out.println(tester + " payment has been made: " + payment1);
        System.out.println(tester + " payment has been made: " + payment2 + "\n");
        lineSeperator();

        //The following will show the order's current status
        System.out.println("Order #: " + order.getNumber() + " the order's status: " + order.getStatus());
        System.out.println("Shipping Order " + order.getNumber() + "... ");
        order.setShipped();
        System.out.println("Order #: " + order.getNumber() + " and status: " + order.getStatus());
        lineSeperator();

        //The following will show that order and shopping cart have lineitem attached to a product

        LineItem item1 = new LineItem(1,799.99, itemOne);
        LineItem item2 = new LineItem(1, 2.99, itemOne);
        tester.getCart().addLineItem(item1);
        tester.getCart().addLineItem(item2);
        System.out.println(tester.getId() + "'s ShoppingCart: ");
        System.out.println(tester.getCart());
        order.addLineItem(item1);
        order.addLineItem(item2);

        System.out.println(tester.getId() + "'s Order: ");
        System.out.println(order);
    }

    //the following will show the output the different functionalities
    public static void lineSeperator(){
        System.out.println( "------------------------------------------------------------------------------");
    }
}
