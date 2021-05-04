package de.demmer.dennis;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product>{

	int i= 25;
	
	
	@Override
	public int compare(Product product1, Product product2) {
		
		
		//1
		if(product1.getPrice() > product2.getPrice()) {
			return 1;
		}
		
		
		//-1
		if(product1.getPrice() < product2.getPrice()) {
			return -1;
		}
		
		
		//0
		if (product1.getPrice() == product2.getPrice()) {
			return 0;
		}
		
		return 0;
	
	}

}
