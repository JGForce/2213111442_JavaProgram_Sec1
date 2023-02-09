import java.util.*;
public class ShapeDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Input radius = ");
		double radius = scan.nextDouble();
		System.out.print("Input height = ");
		double height = scan.nextDouble();
		
		Circle circle = new Circle(radius,null);
		
		System.out.print("Circle[" + circle +"]");
		System.out.print("Circle[area =" + circle.getArea() + "]");
		System.out.println();
		
		Cylinder cylinder = new Cylinder(radius, height);
		
		System.out.print("Cylinder[" + cylinder + "]");
		System.out.print("Cylinder[area =" + cylinder.getArea() + "]");
		System.out.print("Cylinder[volume =" + cylinder.getVolume() + "]");

	}

}
