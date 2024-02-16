package a07_dog.animals;

/**
 * Author: Jan de Rijke
 */
public class Animal {
	protected String name;
	protected String breed;
	protected String colour;
	protected String tagLine ;

	public Animal(
		String name, String breed, String colour, String tagLine) {
		this.name = name;
		this.breed = breed;
		this.colour = colour;
		this.tagLine = tagLine;
	}

	@Override
	public String toString() {
		return name;
	}
}
