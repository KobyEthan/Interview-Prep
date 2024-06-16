package Java;
// Java program to illustrate the difference between shallow and deep copy

// Shallow Copy: Shallow repetition is quicker. However, it’s “lazy” it handles pointers and references. 
// Rather than creating a contemporary copy of the particular knowledge the pointer points to, it simply copies over the pointer price.
// So, each of the first and therefore the copy can have pointers that reference constant underlying knowledge.

// Deep Copy: Deep repetition truly clones the underlying data. It is not shared between the first and therefore the copy.

import java.util.ArrayList;

// Class of Car
class Car {
	public String name;
	public ArrayList<String> colors;

	public Car(String name, ArrayList<String> colors)
	{
		this.name = name;
		this.colors = colors;
	}
}

public class ShallowCopyVsDeepCopy {
	public static void main(String[] args)
	{
		// Create a Honda car object
		ArrayList<String> hondaColors = new ArrayList<>();
		hondaColors.add("Red");
		hondaColors.add("Blue");
		Car honda = new Car("Honda", hondaColors);

		// Deep copy of Honda
		Car deepcopyHonda = new Car(
			honda.name, new ArrayList<>(honda.colors));
		deepcopyHonda.colors.add("Green");
		System.out.print("Deepcopy: ");
		for (String color : deepcopyHonda.colors) {
			System.out.print(color + " ");
		}
		System.out.println("\nOriginal: ");
		for (String color : honda.colors) {
			System.out.print(color + " ");
		}
		System.out.println();

		// Shallow Copy of Honda
		Car copyHonda = honda;
		copyHonda.colors.add("Green");
		System.out.print("Shallow Copy: ");
		for (String color : copyHonda.colors) {
			System.out.print(color + " ");
		}
		System.out.println("\nOriginal: ");
		for (String color : honda.colors) {
			System.out.print(color + " ");
		}
		System.out.println();
	}
}
