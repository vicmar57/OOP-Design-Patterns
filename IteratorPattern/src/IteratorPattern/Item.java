package IteratorPattern;

public class Item {
	String desc;
	String serialNumber;
	
	public Item (String desc, String sn) {
		this.desc = desc;
		this.serialNumber = sn;
	}
	
	String getDesc() {
		return this.desc;
	}
	
	String getSerialNumber() {
		return this.serialNumber;
	}

	@Override
	public String toString() {
		return "Item [desc=" + desc + ", serialNumber=" + serialNumber + "]";
	}
}
