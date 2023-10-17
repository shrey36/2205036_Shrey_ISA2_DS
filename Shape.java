package assignment;

// Shape.java

public class Shape {
	void draw() {
        System.out.println("Drawing a shape");
    }
}
 
// Circle.java
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}
 
// Rectangle.java
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}
 
// Main.java
public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
 
        shape1.draw(); // Output: Drawing a circle
        shape2.draw(); // Output: Drawing a rectangle
    }
}


