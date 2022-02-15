package main;

public class Point extends Shape{
    @Override
    public String getName() {
        return "Point";
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
