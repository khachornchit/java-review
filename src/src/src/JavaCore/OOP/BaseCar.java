package JavaCore.OOP;

public abstract class BaseCar implements ICar {

	public static String name = "Car Model";
	protected String Color = "White";

	public void Brand() {
		System.out.println("Toyota");
	}

	public static void Model() {
		System.out.println(name);
	}

	@Override
	public void Start() {
		System.out.println("Start");		
	}

	@Override
	public void Stop() {
		System.out.println("Stop");		
	}

	@Override
	public void Refuse() {
		System.out.println("Refuse");
	}
}
