package decorator_exemplo;

public class ArCondicionadoDecorator extends Decorator{
	public ArCondicionadoDecorator(Carro component) {
		super(component);
	}
	
	@Override
	public float getValor() {
		float carroValor = super.getValor();
		float arCondicionadoValor = 1000;
		return carroValor + arCondicionadoValor;
	}
}
