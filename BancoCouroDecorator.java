package decorator_exemplo;

public class BancoCouroDecorator extends Decorator{
	public BancoCouroDecorator(Carro component) {
		super(component);
	}
	
	@Override
	public float getValor() {
		float carroValor = super.getValor();
		float bancoValor = 3500;
		return carroValor + bancoValor;
	}
}
