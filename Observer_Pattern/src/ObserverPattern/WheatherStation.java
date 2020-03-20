package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WheatherStation implements IObservable {
    private List <Iobserver> observers;
    private int temperature;

    public WheatherStation(int initTemp) {
        this.observers = new ArrayList<>();
        this.temperature = initTemp;
        System.out.println("WheatherStation: initial temp: " + initTemp);
    }

    @Override
    public void add(Iobserver ob) {
        this.observers.add(ob);
    }

    @Override
    public void remove(Iobserver ob) {
        this.observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for (Iobserver o : this.observers) {
            o.updateObserver();
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int newTemp) {
        this.temperature = newTemp;
        System.out.println("WheatherStation: new temp measured. notifying users..");
        notifyObservers();
    }
}
