package NullObjectPattern;

public class RoutingHandler {
    public void handle(Iterable <Message> messages) {
        for (Message msg : messages) {
            IMsgRouter router = MsgRouterFactory.getRouterForMessage(msg);
            router.route(msg);
        }
    }
}
