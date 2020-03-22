package CommandPattern;

import java.util.ArrayList;
import java.util.List;

   public class Broker {
   private List<IStockCommand> orderList = new ArrayList<>(); 

   public void takeOrder(IStockCommand order){
      orderList.add(order);		
   }

   public void placeOrders(){
   
      for (IStockCommand order : orderList) {
         order.execute();
      }
      orderList.clear();
   }
}
