package de.demmer.dennis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		Product p1 = new Product(9.99f, "HDMI-Kabel", 4546456);
		Product p2 = new Product(399.99f, "CPU", 34968121);
		Product p3 = new Product(200.00f, "Bildschirm", 84847);
		Product p4 = new Product(50.00f, "Tastatur", 15458685);

		List<Product> shoppingCart = new ArrayList<>();

		shoppingCart.add(p1);
		shoppingCart.add(p2);
		shoppingCart.add(p3);
		shoppingCart.add(p4);
		
		Collections.sort(shoppingCart);
		
		//dreht Liste um
		Collections.reverse(shoppingCart);

		
//
//		ProductPriceComparator ppc = new ProductPriceComparator();
//		Collections.sort(shoppingCart, ppc);
//
//		
//		ProductNameComparator pnc = new ProductNameComparator();
//		Collections.sort(shoppingCart, pnc);
		
		
		for (Product product : shoppingCart) {
			System.out.println(product.getId());
		}

	}
}
