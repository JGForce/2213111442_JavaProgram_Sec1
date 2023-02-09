
public class Cylinder extends Circle {
	
	private double height;
	
	public Cylinder(double radius, double heigth) {
		super(radius,null);
		this.height = heigth;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getVolume() {
		return super.getArea() * getHeight();
	}
	
	@Override
	public double getArea() {
		return Math.PI * (getHeight() + getRadius());
	}
	
	@Override
	public String toString() {
		return "height="+this.height+","+super.toString(); 
	}
}

