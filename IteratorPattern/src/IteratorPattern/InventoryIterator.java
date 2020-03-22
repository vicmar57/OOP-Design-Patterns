package IteratorPattern;

interface InventoryIterator {
	boolean isDone();
	void next();
	Item current();
}
