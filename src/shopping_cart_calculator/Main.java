package shopping_cart_calculator;

public class Main {

	
	public static void main(String[] args) {
		

        ShoppinCart cart = new ShoppinCart();

        Itemz item1 = new Itemz("Apple", 1.5, 10);

        Itemz item2 = new Itemz("Banana", 0.5, 5);

        Itemz item3 = new Itemz("Laptop", 1000, 1); // Price is valid here

        item3.category = "electronics";

        cart.addItem(item1);

        cart.addItem(item2);

        cart.addItem(item3);

        boolean isMember = true; // Should be true or false

        String hasCoupon = "YES"; // Should be "YES" or "NO"



        double total = cart.calculateTotal(isMember, hasCoupon);



        if (total < 0) {

            System.out.println("Error in calculation!");

        } else {

        	System.out.println("The total price is: $" + (int)total);

        }

    }


}
