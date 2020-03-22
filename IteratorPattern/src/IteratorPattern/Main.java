package IteratorPattern;

public class Main {
	public static void main (String [] args) {
		HandHeldItemInventory inv = new HandHeldItemInventory(new Item("gum", "123"), new Item("chocolate", "234"));
		InventoryIterator iter = inv.getIterator();
		
		while (!iter.isDone()) {
			System.out.println(iter.current().toString());
			iter.next();
		}
	}
}
