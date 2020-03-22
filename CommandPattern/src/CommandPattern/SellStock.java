package CommandPattern;

public class SellStock implements IStockCommand {
	private Stock abcStock;

	public SellStock(Stock abcStock){
		this.abcStock = abcStock;
	}
	
	@Override
	public void execute() {
		abcStock.sell();
	}

}
