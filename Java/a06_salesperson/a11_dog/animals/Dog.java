package a11_dog.animals;

/**
 * Author: Jan de Rijke
 */
public class Dog extends Animal {
	private final String chipNumber;

	public Dog(String name, String breed, String colour, String chipNumber) {
		super(name, breed, colour, "Like a dog in a bowling game");
		this.chipNumber = chipNumber;
	}

	public String getChipNumber() {
		return chipNumber;
	}

	@Override
	public String toString() {
		return String.format("%s with chip %s",super.toString() ,chipNumber);
	}
}
