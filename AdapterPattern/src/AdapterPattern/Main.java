package AdapterPattern;

public class Main {

	public static void main(String[] args) {
		ICarSpecs bugattiVeyron = new BugattiVeyron();
		ICarSpecsAdapter bugattiVeyronAdapter = new CarSpecImpl(bugattiVeyron);
		System.out.println("Main:: Speed in MPH: " + bugattiVeyron.getSpeed() + " MPH");
		System.out.println("Main:: Speed in KMH: " + bugattiVeyronAdapter.getSpeed() + " KMH");
	}
}
