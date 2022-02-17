package main;

public class Rectangle extends Shape{
    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
