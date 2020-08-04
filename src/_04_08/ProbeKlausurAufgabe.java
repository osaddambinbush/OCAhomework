package _04_08;

import static java.lang.Math.*;

public class ProbeKlausurAufgabe {

}

/**
 * 
 * Aufgabe 1: Klassenentwurf
 * 
 * a. Die Klasse Point und Circle sollen immutable definiert.
 * 
 * b. Die Klasse Circle und Point sollen Thread-safe definiert werden Eure
 * L�sung von b baut nicht von a auf!
 *
 */



//getters and setters dont need to be sychronized in this case
final class Point {

	private int x;
	private int y;


	public int getX() {
		return x;
	}



	public int getY() {
		return y;
	}



	public Point setX(int x) {
		return new Point(x, this.y);
	}



	public Point setY(int y) {
		return new Point(this.x,y);
	}


	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}



	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public double distanceTo(Point other) {
		return sqrt(pow(x - other.x, 2) + pow(y - other.y, 2));
	}
}

final class Circle {

	private double radius;
	private Point center;

	public double getRadius() {
		return radius;
	}



	public Point getCenter() {
		return center;
	}



	public Circle setRadius(double radius) {
		return new Circle(radius, this.center);
	}

	

	public Circle setCenter(Point center) {
		return new Circle(this.radius, center);
	}

	

	public Circle(double radius, Point center) {
		super();
		this.radius = radius;
		this.center = new Point(center.getX(), center.getY());
	}

	

	public double area() {
		return PI * pow(radius, 2);
	}

	public double circumference() {
		return 2 * PI * radius;
	}

	public boolean containsPoint(Point p) {
		return center.distanceTo(p) < radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", center=" + center + "]";

	}
}

class CircleTest {

	public static void main(String[] args) {

		Point p = new Point(12, 13);
		Circle a = new Circle(12.2, p);
		
		System.out.println(a.containsPoint(p));
		System.out.println(a);
	}
}
