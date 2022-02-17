package builderPattern;

public class TestBookUber {

	public static void main(String[] args) {
		BookUber bu=new BookUber();
				bu.login().selectDestination("Deoghar", "Jhajha")
				.selectCar("Sedan")
				.startRide()
				.stopRide().logout();

	}

}
