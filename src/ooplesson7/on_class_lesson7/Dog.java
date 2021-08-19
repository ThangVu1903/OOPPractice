package ooplesson7.on_class_lesson7;

public class Dog extends Cattle {
          private   String height;
          private   String name;
          private    int age;
          private   String color;
          private   String weight;

    public Dog(String name, int age, int gender, String height, String weight) {
        super(name, age, gender);
        this.height = height;
        this.weight = weight;
    }

    public void goForWalk(){

    }

    public void eating(){

    }

    public String getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getWeight() {
        return weight;
    }
}
