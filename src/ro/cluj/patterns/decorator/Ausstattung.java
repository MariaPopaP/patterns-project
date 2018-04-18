package ro.cluj.patterns.decorator;

public abstract class Ausstattung implements IAuto {

	protected IAuto auto;
	public Ausstattung (IAuto pIAuto)
	{
		auto = pIAuto;
	}
	

	
}
