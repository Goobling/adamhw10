/*

abstract classes are used to make a broad object which can initilize methods 
interfaces are used to create a tyoe with declared methods.

*/
package adamCsc211;

// methods for shapee with interface
interface shapee {

  double calcArea();

  double calcPerimeter();

  void output();

}

// Shapee oject class
abstract class Shapee implements shapee {
  String color;
  String name;

  public Shapee(String color, String name) {
    this.color = color;
    this.name = name;
  }

  // mehods from interface
  @Override
  public void output() {
    System.out.println("color: " + color + " shapee: " + name);
    System.out.println("area: " + calcArea());
    System.out.println("perimeter: " + calcPerimeter());
  }

  @Override
  abstract public double calcArea();

  abstract public double calcPerimeter();

}

// create a shapee object from interface and abstract class
class Rectangle extends Shapee {
  private double length;
  private double width;

  public Rectangle(String color, double length, double width) {
    super(color, "Rectangle");
    this.length = length;
    this.width = width;
  }

  @Override
  public double calcArea() {
    return length * width;

  }

  @Override
  public double calcPerimeter() {
    return 2 * (length + width);
  }

}
// main

public class homeworkTen {
  public static void main(String[] args) {
    // make shapees
    Rectangle rectangle = new Rectangle("Blue", 5, 3);

    // print output method
    rectangle.output();
  }
}
