package ro.cluj.patterns.decorator;

public class Seitenairbag extends Ausstattung {

	public Seitenairbag(IAuto pIAuto) {
		super(pIAuto);
		
	}

	public int gibKosten() {
	
		return auto.gibKosten()+1000;
	}

	public void zeigeDetails() {
		auto.zeigeDetails();
		System.out.print(", Seitenairbags");

	}

}
