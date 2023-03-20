package vn.sunasterisk.treemanagement.model;

public class Flower {
    private String name;
    private String color;

    public String displayInformation() {
        //System.out.println("Thong tin flower: " + name + "-" + color);
       return "Thong tin flower: " + name + "-" + color;
    }

    public Flower(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String changeName(String name) {
        return name;
    }

    public void changeColor(String color) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
