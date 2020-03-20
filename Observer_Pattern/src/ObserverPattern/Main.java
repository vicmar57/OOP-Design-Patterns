package ObserverPattern;

public class Main {
    public static void main (String [] args) {
        WheatherStation ws = new WheatherStation(25);
        PhoneDisplay pd1 = new PhoneDisplay(ws);
        PhoneDisplay pd2 = new PhoneDisplay(ws);

        ws.add(pd1);
        ws.add(pd2);
        ws.setTemperature(27);
    }
}
