package NullObjectPattern;

public class JmsRouter implements IMsgRouter {
    @Override
    public void route(Message msg) {
        // implementation details
    	System.out.println("routing JMS message");
    }
}
