package AdapterPattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdapterPatternTest {

	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
	    ICarSpecs bugattiVeyron = new BugattiVeyron();
	    ICarSpecsAdapter bugattiVeyronAdapter = new CarSpecImpl(bugattiVeyron);
	  
	    assertEquals(bugattiVeyronAdapter.getSpeed(), 408.4665854);
	}


}
