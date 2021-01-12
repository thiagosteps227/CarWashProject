public class Car {

	private String registration;
	private Detailer detailer;
	private String make;
	private String color;
	private static int numberOfCars;
	
	public Car() {
		numberOfCars++;
	}
	
	public Car(String registration, Detailer detailer, String make, String color) {
		this.registration = registration;
		this.detailer = detailer;
		this.make = make;
		this.color = color;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public Detailer getDetailer() {
		return detailer;
	}

	public void setDetailer(Detailer detailer) {
		this.detailer = detailer;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static int getNumberOfCars() {
		return numberOfCars;
	}
	
	@Override
	public String toString() {
	
		return "Car to wash: [Registration = "+registration+", Make = "+make+", color = "+color+", Assigned to "+detailer.getName()+" ]";
	}
}
