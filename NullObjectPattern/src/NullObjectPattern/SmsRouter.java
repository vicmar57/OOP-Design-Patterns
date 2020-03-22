package NullObjectPattern;

public class SmsRouter implements IMsgRouter {
    @Override
    public void route(Message msg) {
        // implementation details
    	System.out.println("routing SMS message");
    }
}
