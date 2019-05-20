package sandboxLorOliv;

public class Myvehicle {
	
	private String name = "";
	private MyVehicleType type;
	
	public Myvehicle(MyVehicleType type) {
		this.type = type;
	}
	public Myvehicle(String name, MyVehicleType type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public MyVehicleType getType() {
		return type;
	}
	public void setType(MyVehicleType type) {
		this.type = type;
	}


}
