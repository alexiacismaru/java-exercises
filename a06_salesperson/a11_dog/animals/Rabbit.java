package a11_dog.animals;

/**
 * Author: Jan de Rijke
 */
public class Rabbit extends Animal {

	private boolean digs;

	public Rabbit(String name, String breed, String colour, boolean digs) {
		super(name, breed, colour, "I'm an Ice Rabbit");
		this.digs = digs;
	}
	public String toString() {
		return String.format(super.toString() + " that " + (digs?"digs.":"does not dig."));
	}
}
