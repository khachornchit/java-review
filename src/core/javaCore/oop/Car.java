package src.core.javaCore.oop;

public class Car extends BaseCar {

	protected int Year;
	protected int Wheels;

	public Car(int year, int wheel) {
		super();
		this.Year = year;
		this.Wheels = wheel;
	}

	public static void main(String[] args) {
		Car a = new Car(2015, 4);
		Car b = new Car(2016, 8);
		Car c = new Car(2017, 10);

		name = "Update Model";
		Model();
		
		a.Info();
		b.Info();
		c.Info();
		
		a.Start();
		a.Stop();
		a.Refuse();
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		this.Year = year;
	}

	public int getWheel() {
		return Wheels;
	}

	public void setWheel(int wheel) {
		this.Wheels = wheel;
	}

	@Override
	public void Info() {
		this.Brand();
		System.out.println(String.format("Car year %s, %s wheels, color :  %s", this.Year, this.Wheels, this.Color));
	}
	
	@Override
	public void Brand() {
		System.out.println("Honda");
	}

}
