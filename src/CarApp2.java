import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		ArrayList<Car> cars = new ArrayList<>();

		Car car1 = new UsedCar("Ford", "Fiesta", 2014, 12000, 65000);
		Car car2 = new UsedCar("Mazda", "Miata", 1995, 4000, 11700);
		Car car3 = new Car("Toyota", "Supra", 2020, 49990);
		Car car4 = new Car("Subaru", "BRZ", 2019, 28645);

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);

		// System.out.println("Make\tModel\tYear\tPrice");
		// System.out.println("-------------------------------");
		boolean valid = true;
		do {
			int count = 1;
			for (Car car : cars) {
				System.out.print(count + ") ");
				System.out.println(car.toString());
				count++;
			}
			System.out.println(count + ") Quit");

			int userInput = 0;
			boolean isValid = true;
			do {
				isValid = true;
				System.out.println("Which car would you like?");
				try {
					userInput = scnr.nextInt();
					
				} catch (InputMismatchException ex) {
					System.out.println("Not valid selection.");
					scnr.nextLine();
					isValid = false;
				}
			} while (!isValid);

			scnr.nextLine();
			if (userInput > cars.size()) {
				System.out.println("Have a great day!");
				return;
			}
			userInput = userInput - 1;
			System.out.println(cars.get(userInput).toString());

			System.out.println("Would you like to buy this car? (y/n): ");
			String temp = scnr.nextLine();

				if (temp.equalsIgnoreCase("y")) {
					System.out.println("Great! Our finance department will be in touch shortly!");
					cars.remove(userInput);
				} else {
					System.out.println("Would you like to look at another car then? (y/n): ");
					temp = scnr.nextLine();
					if(temp.equalsIgnoreCase("y")) {
						valid = true;
					}else {
						System.out.println("Goodbye!");
						valid = false;
					}
				}

		} while (valid);

		scnr.close();
	}// main

}// class
