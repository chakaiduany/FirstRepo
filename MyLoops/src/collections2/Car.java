package collections2;

public class Car {
	
	private String make;
	private String model;
	private double price;
	private boolean automatic;
	
	public Car(String make, String model, double price, boolean automatic) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.automatic = automatic;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", price=" + price + ", automatic=" + automatic + "]";
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAutomatic() {
		return automatic;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}
	
	
	

}
