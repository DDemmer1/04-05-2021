package de.demmer.dennis;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		
		String name1 = p1.getName();
		String name2 = p2.getName();

		int comp = name1.compareTo(name2);
		
		return comp;
		
	}
	

}
