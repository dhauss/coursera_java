package com.javoo.store.drivers;
import java.util.Date;
import com.javaoo.store.Item;
import com.javaoo.store.Artist;
import com.javaoo.store.Book;
import com.javaoo.store.CD;
import com.javaoo.store.ClassicalCD;
import com.javaoo.store.Inventory;



public class InventoryDriver {

	public static void main(String[] args) {
		Item[] myInventory = new Item[50];
		String[] performers1 = {"Harry", "Sally", "Wilfred", "Ryan", "manbeast"};
		String[] performers2 = {"Manfred", "Gotfried", "Stanfried", "Friedfried"};
		
		myInventory[0] = new Book("Hey", 10.5, 5, "Auth", "pubs", "Cats");
		myInventory[1] = new Book("I'm", 15, 6, "Aut", "publisher", "Dogs");
		myInventory[2] = new Book("A", 121.3, 50, "Auteur", "pubbin", "Rats");
		myInventory[3] = new Book("Book", 14.2, 1005, "Sav", "pubby", "Iguana");
		myInventory[4] = new Book("bruh", 1999.99, 4, "Good Will", "Hunting", "Cats");
		myInventory[5] = new CD("No", .99, 95, new Artist("Yes"), new Date("1/1/1111"));
		myInventory[6] = new CD("Yes", .98, 99, new Artist("No"), new Date("1/1/9999"));
		myInventory[7] = new ClassicalCD("BOring", .09, 10000, "Old White Guy", performers1, "Illinois", new Date("1/1/1111"));
		myInventory[8] = new ClassicalCD("Better", .1, 10000, "Young White Guy", performers2, "Ohio", new Date("1/1/1111"));


		Inventory.produceReport(myInventory);
	}

}
