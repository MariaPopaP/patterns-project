package ro.cluj.patterns.decorator;

public class Navigationssytem extends Ausstattung {

	public Navigationssytem(IAuto pIAuto) {
		super(pIAuto);
		// TODO Auto-generated constructor stub
	}

	public int gibKosten() {
		
		return auto.gibKosten()+2500;
	}

	public void zeigeDetails() {
		auto.zeigeDetails();
		System.out.print(", Navigationssytem");

	}

	
}
