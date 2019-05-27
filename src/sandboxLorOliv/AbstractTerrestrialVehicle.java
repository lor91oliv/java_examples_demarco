package sandboxLorOliv;

public abstract class AbstractTerrestrialVehicle extends AbstractVehicle{

	public AbstractTerrestrialVehicle(EnumEngineType type) {
		super(type);
	}

	public AbstractTerrestrialVehicle(String name, EnumEngineType type) {
		super(name, type);
	}
}
