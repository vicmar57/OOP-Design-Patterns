package IteratorPattern;

public class HandHeldItemInventory implements Inventory{
	public Item right;
	public Item left;
	
	public HandHeldItemInventory(Item right,  Item left) {
		this.right = right;
		this.left = left;
	}
	
	public Item getRight() {
		return right;
	}

	public void setRight(Item right) {
		this.right = right;
	}

	public Item getLeft() {
		return left;
	}

	public void setLeft(Item left) {
		this.left = left;
	}

	@Override
	public InventoryIterator getIterator() {
		return new HandHeldInventoryIterator(this);
	}

}
