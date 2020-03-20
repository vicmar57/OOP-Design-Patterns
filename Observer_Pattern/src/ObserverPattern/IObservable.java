package ObserverPattern;

public interface IObservable {
    public void add(Iobserver ob);
    public void remove(Iobserver ob);
    public void notifyObservers();
}
