package sandboxLorOliv;

public class AbstractVehicle {

	private String name = "";
	private EnumEngineType engineType = EnumEngineType.NONE;
	private double range = 0.0;  // kilometers
	private double endurance = 0.0; // hours
	private int numMaxPassengers = 0; //variabile intera
	private double maxPayload = 0.0; // kg


	public AbstractVehicle(EnumEngineType type) {
		this.engineType = type;
	}
	public AbstractVehicle(String name, EnumEngineType engineType, double range, double endurance, int numMaxPassengers,
			double maxPayload) {
		super();
		this.name = name;
		this.engineType = engineType;
		this.range = range;
		this.endurance = endurance;
		this.numMaxPassengers = numMaxPassengers;
		this.maxPayload = maxPayload;


	}


	public AbstractVehicle(String name, EnumEngineType type) {
		this.name = name;
		this.engineType = type;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EnumEngineType getEngineType() {
		return engineType;
	}
	public void setEngineType(EnumEngineType engineType) {
		this.engineType = engineType;
	}




}
