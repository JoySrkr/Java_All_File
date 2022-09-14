import java.util.Scanner;
public class Circle {
double radius;
String color;
public Circle(double radius, String color) {
this.radius = radius;
this.color = color;
}
public Circle() {
radius = 1.0;
color = "RED";
}
public double getArea() {
return radius * radius * Math.PI;
}  
public class Cylinder extends Circle {
double height;
public Cylinder() {
this.height = 1.0;
}
public Cylinder(double radius, String color, double height) {
super(radius, color);
this.height = height;
}
@Override
public double getArea() {
return 2 * Math.PI * radius * height + 2 * super.getArea();
}
}
}
