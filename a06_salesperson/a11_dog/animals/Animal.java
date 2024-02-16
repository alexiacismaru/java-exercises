package a11_dog.animals;

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

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("%s is a %s %s",name,colour,breed);
	}
}
