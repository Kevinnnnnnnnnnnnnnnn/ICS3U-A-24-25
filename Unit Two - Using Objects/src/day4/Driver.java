package day4;

public class Driver {
    public static void main(String[] args) {
        Product laptop = new Product("laptop", 999.99, 5);
        Product headphones = new Product("headphones", 199.99, 10);

        Customer alice = new Customer("Alice", 1200.00);
        alice.addToCart(laptop);
        alice.addToCart(headphones);
        String cartContents = alice.getCart();
        System.out.println(cartContents);

        double totalCost = laptop.price + headphones.price;
        System.out.println(totalCost);
        
        Order oderForLaptop = new Order(alice, laptop);
        String orderConfirmation = orderForLaptop.confirmOrder();
        System.out.println(orderConfirmation);
    }
}
