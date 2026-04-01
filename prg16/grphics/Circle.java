package grphics;
public class Circle implements Graphicsi{
	double radius;
	public Circle(double r){
		radius=r;
	}
	public double perimeter(){
		return 2 * Math.PI * radius;
	}
	public double area(){
		return Math.PI * radius * radius;
	}
}
