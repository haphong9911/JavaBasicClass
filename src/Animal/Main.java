package Animal;

import vn.sunasterisk.treemanagement.Cat;
import vn.sunasterisk.treemanagement.Dog;

public class Main {

	 public static void main(String[] args) {
	        Dog myDog = new Dog("Max", 2, "Golden Retriever", "Golden", 30.0);
	        System.out.println("Dog's name: " + myDog.getName());
	        System.out.println("Dog's age: " + myDog.getAge());
	        System.out.println("Dog's breed: " + myDog.getBreed());
	        System.out.println("Dog's color: " + myDog.getColor());
	        System.out.println("Dog's weight: " + myDog.getWeight());
	        
	        Cat myCat = new Cat("Luna", 1, "Siamese", "White", 10.0);
	        System.out.println("Cat's name: " + myCat.getName());
	        System.out.println("Cat's age: " + myCat.getAge());
	        System.out.println("Cat's breed: " + myCat.getBreed());
	        System.out.println("Cat's fur color: " + myCat.getFurColor());
	        System.out.println("Cat's height: " + myCat.getHeight());
	    }

}
