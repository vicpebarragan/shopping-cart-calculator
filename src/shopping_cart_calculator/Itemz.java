package shopping_cart_calculator;

public class Itemz {
	String name;

    double price;

    int qty;

    String category;

    double envFee = 0;



    Itemz(String n, double p, int q) {

        name = n;

        price = p;

        qty = q;

        category = "general";

    } 



    double getTotal() {

        return price * qty;

    }
}
