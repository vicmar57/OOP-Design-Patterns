package NullObjectPattern;

public class NullMsgRouter implements IMsgRouter {
    @Override
    public void route(Message msg) {
        // do nothing
    	System.out.println("discarding message");
    }
}
