package a07_dog.animals;

/**
 * Author: Jan de Rijke
 */
public class Rabbit extends Animal {

	private boolean digs;

	public Rabbit(String name, String breed, String colour, boolean digs) {
		super(name, breed, colour, "I'm an Ice Rabbit");
		this.digs = digs;
	}
}
