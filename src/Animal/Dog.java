package Animal;

public class Dog extends Animal {
    private String color;
    private double weight;
    
    public Dog(String name, int age, String breed, String color, double weight) {
        super(name, age, breed);
        this.color = color;
        this.weight = weight;
    }
    
    public String getColor() {
        return color;
    }
    
    public double getWeight() {
        return weight;
    }
}