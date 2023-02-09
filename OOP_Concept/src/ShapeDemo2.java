import  java.util.*;
public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sizeArrays = 5;
		int i,f;
		
		double[] radius = new double [sizeArrays];
		double[] height = new double [sizeArrays];
		
		for(i = 0; i<sizeArrays ;i++) {
			System.out.print("Input radius and height : ");
			radius[i] = scan.nextDouble();
			height[i] = scan.nextDouble();
		}
		System.out.println();
		
		for(f = 0 ; f<sizeArrays ;f++) {
			Cylinder cylinder = new Cylinder(radius[f],height[f]);
			System.out.println("Cylinder "+(f+1)+", volume = "+cylinder.getVolume());
		}
	}

}
