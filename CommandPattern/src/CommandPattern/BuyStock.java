package CommandPattern;

public class BuyStock implements IStockCommand{

   private Stock abcStock;

   public BuyStock(Stock abcStock){
      this.abcStock = abcStock;
   }
	   
	@Override
	public void execute() {
		abcStock.buy();
	}

}
