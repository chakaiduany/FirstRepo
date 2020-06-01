package collections2;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		// 1. we will create a car class
		// 2. we will create am ArrayList to store Car objects
		// 3. we will use an *Enhance For Loop* to iterate throughout our list of Cars
		
		Car jeep = new Car("Jeep", "Cherokee", 20000, true);
		
		ArrayList<Car> cars = new ArrayList<Car>();
		
		cars.add(jeep);
		cars.add(new Car("Tesla", "S3", 80000, true));
		
		System.out.println(cars);
		
		jeep.setModel("Wrangler");
		
		for (Car c : cars) {
			System.out.println("The model is: " + c.getModel());
			// this is an example of encapsulation
		}
		
	}

}
