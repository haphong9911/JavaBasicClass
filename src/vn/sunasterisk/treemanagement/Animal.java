package vn.sunasterisk.treemanagement;

public class Animal {
    private String name;
    private int age;
    private String breed;
    
    public Animal(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getBreed() {
        return breed;
    }
}

