package NullObjectPattern;

public class MsgRouterFactory {

    public static IMsgRouter getRouterForMessage(Message msg) {

        if (msg.getPriority() == null) {
            return new NullMsgRouter();
        }

        switch (msg.getPriority()) {
            case "high":
                return new SmsRouter();

            case "medium":
                return new JmsRouter();

            default:
                return new NullMsgRouter();
        }

    }
}
