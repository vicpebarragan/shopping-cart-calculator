package shopping_cart_calculator;

import java.util.ArrayList;
import java.util.List;

public class ShoppinCart {

	List<Itemz> items;

    double taxRate = 0.08;

    double memberDiscount = 0.05;

    double bigSpenderDiscount = 10;

    double couponDiscount = 0.15;

    String currency = "USD";



    ShoppinCart() {

        items = new ArrayList<>();

    }



    void addItem(Itemz item) {

        items.add(item);

    }



    double calculateSubtotal() {

        double subtotal = 0;

        for (Itemz item : items) {

            subtotal += item.getTotal();

        }

        return subtotal;

    }



    double applyDiscounts(double subtotal, boolean isMember) {

        if (isMember) {

            subtotal = subtotal - (subtotal * memberDiscount);

        }

        if (subtotal > 100) {

            subtotal = subtotal - bigSpenderDiscount;

        }

        return subtotal;

    }



    double calculateTotal(boolean isMember, String hasCoupon) {

//delete this after generating value

        double subtotal = calculateSubtotal();

        subtotal = applyDiscounts(subtotal, isMember);

        double total = subtotal + (subtotal * taxRate);

        if ("YES".equals(hasCoupon)) {

            total = total - (total * couponDiscount);

        }
        
        for (Itemz item : items) {

            if (item.category.equals("electronics")) {
            	total += 5;
            }

        }

        return total;

    }
	
}
