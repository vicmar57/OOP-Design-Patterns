package AdapterPattern;

public class CarSpecAdapter implements IMetricCarSpecs {

    private IImperialCarSpecs luxuryCarsSpecAdaptee;
    
    // standard constructors
    public CarSpecAdapter(IImperialCarSpecs carSpec) {
		this.luxuryCarsSpecAdaptee = carSpec;
	}

	@Override
	public double getSpeed() {
		return this.luxuryCarsSpecAdaptee.getSpeed() * 1.60934;
	}
}
