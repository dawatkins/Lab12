import java.util.ArrayList;
import java.util.Scanner;

public class CarApp{

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		ArrayList<Car> cars = new ArrayList<>();
		
		System.out.println("How many cars would you like to enter?");
		int amountCars = scnr.nextInt();
		scnr.nextLine();
		
		for (int i = 1; i <= amountCars; i++) {
			System.out.println("Car #" + i);
			System.out.println("Enter the make: ");
			String makeTemp = scnr.nextLine();
			System.out.println("Enter the model: ");
			String modelTemp = scnr.nextLine();
			System.out.println("Enter the year: ");
			int yearTemp = scnr.nextInt();
			scnr.nextLine();
			System.out.println("Enter the price: ");
			double priceTemp = scnr.nextDouble();
			scnr.nextLine();
			Car car = new Car(makeTemp, modelTemp, yearTemp, priceTemp);
			cars.add(car);
		}
		
		System.out.println("Make\tModel\tYear\tPrice");
		System.out.println("-------------------------------");
		for(Car car : cars) {
			System.out.println(car.toString());
		}
		
		scnr.close();
	}

}
