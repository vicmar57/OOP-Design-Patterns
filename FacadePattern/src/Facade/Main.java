package Facade;

import org.apache.log4j.BasicConfigurator;

public class Main {

	public static void main(String[] args) {
		BasicConfigurator.configure();

		CarEngineFacade cef = new CarEngineFacade();
		cef.startEngine();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cef.stopEngine();
	}

}
