package de.demmer.dennis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Product p1 = new Product(9.99f, "HDMI-Kabel");
		Product p2 = new Product(399.99f, "CPU");
		Product p3 = new Product(200.00f, "Bildschirm");
		Product p4 = new Product(50.00f, "Tastatur");
		
		
		List<Product> shoppingCart = new ArrayList<>();
		
		shoppingCart.add(p1);
		shoppingCart.add(p2);
		shoppingCart.add(p3);
		shoppingCart.add(p4);
		
		
		ProductPriceComparator ppc = new ProductPriceComparator();
		Collections.sort(shoppingCart, ppc);
		
		
		
//		Collections.reverse(shoppingCart);

	
		
		for (Product product : shoppingCart) {
			System.out.println(product.getPrice());
		}
		
		
		
		




		
		
	}
}
