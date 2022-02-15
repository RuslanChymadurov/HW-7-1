package main;

public class Circle extends Shape{

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public void print() {
        System.out.println(getName());
    }


}
