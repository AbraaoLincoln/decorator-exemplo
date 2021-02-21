package decorator_exemplo;

public class GpsDecorator extends Decorator{
	public GpsDecorator(Carro component) {
		super(component);
	}
	
	@Override
	public float getValor() {
		float carroValor = super.getValor();
		float gpsValor = 300;
		return carroValor + gpsValor;
	}
}
