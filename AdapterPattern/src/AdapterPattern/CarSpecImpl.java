package AdapterPattern;

public class CarSpecImpl implements ICarSpecsAdapter {

    private ICarSpecs luxuryCarsSpec;
    
    // standard constructors
 
    public CarSpecImpl(ICarSpecs carSpec) {
		luxuryCarsSpec = carSpec;
	}

	@Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCarsSpec.getSpeed());
    }
     
    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }

}
