package tema5;

import java.util.ArrayList;

public class ejemploArrayList {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);

		if (cars.contains("Ford"))
			System.out.println("Tiene ford");

		String lineas[] = new String[cars.size()];
		for (int i = 0; i < cars.size(); i++)
			lineas[i] = cars.get(i).toString();

		for (int i = 0; i < cars.size(); i++)
			System.out.println(lineas[i]);

	}

}
