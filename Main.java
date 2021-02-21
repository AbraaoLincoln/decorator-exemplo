package decorator_exemplo;

public class Main {
	public static void main(String[] args) {
		//Criando um Sedan normal
		Carro c1 = new Sedan(70000);
		System.out.println("Preço Sedan normal: " + c1.getValor());
		
		//Criando um Sedan com ar-condicionado
		Carro c2 = new ArCondicionadoDecorator(new Sedan(70000));
		System.out.println("Preço Sedan com ar-condicionado: " + c2.getValor());
		
		//Criando um Sedan com ar-condicionado e gps
		Carro c3 = new ArCondicionadoDecorator(new GpsDecorator(new Sedan(70000)));
		System.out.println("Preço Sedan com ar-condicionado e gps: " + c3.getValor());
		
		//Criando um Conversivel com banco de couro
		Carro c4 = new BancoCouroDecorator(new Conversivel(120000));
		System.out.println("Preço Conversivel com banco de couro: " + c4.getValor());
		
		//Criando um Conversivel com banco de couro, ar-condicionado e gps
		Carro c5 = new ArCondicionadoDecorator(new GpsDecorator(new BancoCouroDecorator(new Conversivel(120000))));
		System.out.println("Preço Conversivel com banco de couro, ar-condicionado e gps: " + c5.getValor());
	}
}
