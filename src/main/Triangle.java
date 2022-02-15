package main;

public class Triangle extends Shape{
    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
