package a07_dog;

import a07_dog.animals.Dog;
import a07_dog.animals.Rabbit;

/**
 * Author: Jan de Rijke
 */
public class AnimalTest {
	public static void main(String[] args) {
		System.out.printf("Animals: %s, %s" ,
			new Dog("Ramses", "Border Collie","Black","5522"),
			new Rabbit("Floppy","Angora", "gray",true));
	}
}
