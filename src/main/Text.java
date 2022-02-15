package main;

public class Text extends Shape{
    @Override
    public String getName() {
        return "Text";
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
