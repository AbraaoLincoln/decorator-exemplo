package decorator_exemplo;

public abstract class Decorator extends Carro{
	private Carro component;
	
	public Decorator(Carro compenent) {
		this.component = compenent;
	}
	
	@Override
	public float getValor() {
		return component.getValor();
	}
}
