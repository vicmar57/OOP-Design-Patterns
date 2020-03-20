package ObserverPattern;

public class PhoneDisplay implements Iobserver{
    private WheatherStation station;

    public PhoneDisplay(WheatherStation ws) {
        this.station = ws;
    }

    @Override
    public void updateObserver() {
        System.out.println("PhoneDisplay: got an update! New Temperature: " + this.station.getTemperature());
    }
}
