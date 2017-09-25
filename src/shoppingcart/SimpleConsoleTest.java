package shoppingcart;

import java.io.FileNotFoundException;

// CS211 BC, W.P. Iverson
// September 2017
public class SimpleConsoleTest {

    public static void main(String[] args) throws FileNotFoundException {
    	Comparable<Sku> one = new Sku("book",13.000);
		Sku two = new Sku("book",13);
		Sku three = new Sku("another",42);
		System.out.println(one.compareTo(two));  // 0 from Comparable
		System.out.println(one.equals(two));  // false from Object
		System.out.println(two); // book, $13.00
		System.out.println(two.priceFor(123)); // 1599.0
		ShoppingCart basket = new ShoppingCart();
		System.out.println(basket.size()); // 0
		NumSelected five = new NumSelected(two,5); 
		NumSelected six = new NumSelected(three,6); 
		basket.add(five);
		basket.add(six);
		System.out.println(basket.size()); // 2
		basket.add(new NumSelected(three,7));
		System.out.println(basket.size()); // 2
		System.out.println(basket.getTotal());  // 359.0
		six = new NumSelected(three,1);
		basket.add(six);
		System.out.println(basket.getTotal());  // 107.0
		basket.setDiscount(true);
		System.out.println(basket.getTotal());  // 96.3
		basket.setDiscount(false);
		System.out.println(basket.getTotal());  // 107.0
    }
}