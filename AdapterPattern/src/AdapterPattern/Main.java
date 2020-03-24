package AdapterPattern;

public class Main {

	public static void main(String[] args) {
		IImperialCarSpecs bugattiVeyron = new BugattiVeyron();
		IMetricCarSpecs bugattiVeyronAdaptee = new CarSpecAdapter(bugattiVeyron);
		System.out.println("Main:: Speed in MPH: " + bugattiVeyron.getSpeed() + " MPH");
		System.out.println("Main:: Speed in KMH: " + bugattiVeyronAdaptee.getSpeed() + " KMH");
	}
}
