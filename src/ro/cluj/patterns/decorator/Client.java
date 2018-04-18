package ro.cluj.patterns.decorator;

public class Client {

	public static void main(String[] args)
	{
		IAuto auto = new Klimaanlage( new Limousine());
		auto.zeigeDetails();
		System.out.println("\nfuer "+ auto.gibKosten() + " Euro\n");
		
		auto = new Navigationssytem( new Seitenairbag(auto));
		auto.zeigeDetails();
		System.out.println("\nfuer "+ auto.gibKosten() + " Euro\n");
		
		auto = new Navigationssytem(new Seitenairbag(new Cabrio()) );
		auto.zeigeDetails();
		
		System.out.println("\nfuer "+ auto.gibKosten() + " Euro\n");
		
		auto = new Radio(new Seitenairbag(new Cabrio()));
		auto.zeigeDetails();	
		System.out.println("\nfuer "+ auto.gibKosten() + " Euro\n");
		
		
	}
	
}
