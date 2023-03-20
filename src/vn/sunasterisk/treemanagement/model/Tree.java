package vn.sunasterisk.treemanagement.model;

public class Tree {
    private String name;
    private double height;
    private Flower flower;

    public String displayInformation() {
        // System.out.println("Thong tin tree:"+name +"-"+height +"-" + flower.displayInformation());
        return "Thong tin tree:" + name + "-" + height + "-" + flower.displayInformation();
    }

    public Tree(String name, double height, Flower flower) {
        this.name = name;
        this.height = height;
        this.flower = flower;
    }

    public void changeName(String name) {
        setName(name);
    }

    public void changeHeight(double height) {
        setHeight(height);

    }

    public void changeFlower(Flower flower) {
        setFlower(flower);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }
}

