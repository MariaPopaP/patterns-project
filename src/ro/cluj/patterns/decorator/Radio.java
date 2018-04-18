package ro.cluj.patterns.decorator;

public class Radio extends Ausstattung {

	public Radio(IAuto pIAuto) {
		super(pIAuto);
		
	}

	public int gibKosten() {
		
		return auto.gibKosten()+500;
	}

	public void zeigeDetails() {
		auto.zeigeDetails();
		System.out.print(", Radio");

	}

}
