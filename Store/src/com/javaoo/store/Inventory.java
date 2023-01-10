package com.javaoo.store;

public class Inventory {

		public static void produceReport(Item[] items) {
			int totalCount = 0;
			double totalVal = 0;
			
			for(Item item: items) {
				if(item != null) {
					totalCount += item.getQuantity();
					totalVal += item.getPrice();
					System.out.printf("%s price: %.2f, quantity: %d\n",
							item.getTitle(), item.getPrice(), item.getQuantity());
				}
				else {
					continue;
				}
			}
			System.out.printf("Total count: %,d\nTotal value: %,.2f\n", totalCount, totalVal);
			
	}

}
