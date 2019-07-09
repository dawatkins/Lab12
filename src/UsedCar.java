
public class UsedCar extends Car {
	private double mileage;

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	// @override
	public UsedCar(String make, String model, int year, double price, double mileage) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return (getMake() + "  \t" + getModel() + "  \t" + getYear() + "  \t$" + getPrice() + " (Used)" + getMileage() + "miles");
	}
}
