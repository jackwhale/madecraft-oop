package exercises;

import java.util.ArrayList;

public class Smurf {

	private String name;
	private static ArrayList<String> usedNames = new ArrayList();

	public static Smurf createSmurf(String name) {
		System.out.println("Creating " + name + " Smurf");
		if(validName(name)) {
			usedNames.add(name);
			return new Smurf(name);
		}

		System.out.println("ERROR: The name '" + name + "' has already been used. You must provide an unused name.");
		return null;
	}

	private Smurf(String name) {
		this.name = name;
	}

	private static boolean validName(String name) {
		if(Smurf.usedNames.contains(name)) {
			return false;
		}

		return true;
	}


	public String getName() {
		return name;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

}
