package Composite1;

public class Triangle implements Shape {
    @Override
    public void draw(String color) {
        System.out.println("triangle color: " + color);
    }
}