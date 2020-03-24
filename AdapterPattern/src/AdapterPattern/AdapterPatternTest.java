package AdapterPattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdapterPatternTest {

	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
	    IImperialCarSpecs bugattiVeyron = new BugattiVeyron();
	    IMetricCarSpecs bugattiVeyronAdapter = new CarSpecAdapter(bugattiVeyron);
	  
	    assertEquals(bugattiVeyronAdapter.getSpeed(), 408.4665854);
	}


}
