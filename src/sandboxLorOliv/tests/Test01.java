package sandboxLorOliv.tests;

import sandboxLorOliv.Myvehicle;
import sandboxLorOliv.MyVehicleType;

public class Test01 {

	public static void main(String[] args) {
		
		Myvehicle v1 = new Myvehicle(MyVehicleType.TERRESTRIAL);
		v1.setName("Fiat 700");
		
		Myvehicle v2 = new Myvehicle("Eurofighter", MyVehicleType.AERIAL);

		System.out.println("v1 - Name: " + v1.getName());
		System.out.println("v1 - Type: " + v1.getType());
		
		System.out.println("v2 - Name: " + v2.getName());
		System.out.println("v2 - Type: " + v2.getType());
		
	}

}
