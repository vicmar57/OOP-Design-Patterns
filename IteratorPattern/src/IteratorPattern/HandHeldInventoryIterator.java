package IteratorPattern;

public class HandHeldInventoryIterator implements InventoryIterator {
	private HandHeldItemInventory inventory;
	int index;
	public HandHeldInventoryIterator(HandHeldItemInventory inventory) {
		this.inventory = inventory;
		this.index = 0;
	}
	
	@Override
	public boolean isDone() {
		return this.index >= 2;
	}

	@Override
	public void next() {
		this.index ++;
	}

	@Override
	public Item current() {
		switch(index) {
		case 0:
			return inventory.right;
		case 1:
			return inventory.left;
		default:
			return null;
		}
	}

}
