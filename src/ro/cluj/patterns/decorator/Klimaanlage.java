package ro.cluj.patterns.decorator;

public class Klimaanlage extends Ausstattung {

	public Klimaanlage(IAuto pIAuto) {
		super(pIAuto);
		
	}

	public int gibKosten() {
		
		return auto.gibKosten()+1500;
	}

	public void zeigeDetails() {
		
		auto.zeigeDetails();
		System.out.print(",Klimaanlage");

	}
	

}
