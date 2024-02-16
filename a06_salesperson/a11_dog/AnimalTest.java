package a11_dog;

import a11_dog.animals.Animal;
import a11_dog.animals.Dog;
import a11_dog.animals.Rabbit;

/**
 * Author: Jan de Rijke
 */
public class AnimalTest {
	public static void main(String[] args) {
		Animal[] garden = {
			new Dog("Ramses", "Border Collie", "black", "5522"),
			new Rabbit("Floppy", "Angora", "gray", true),
			new Animal("Animal", "Muppet", "brown", "BEAT DRUMS, BEAT DRUMS")
		};
		String[] names = {"Leonardo", "Donatello", "Michelangelo"};
		for (int i = 0; i < garden.length; i++) {
			garden[i].setName(names[i]);
			System.out.println(garden[i]);
		}
	}
}
