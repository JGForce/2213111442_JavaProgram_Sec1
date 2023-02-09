
public abstract class Shape {

	private String color;
	
	public Shape() {
		this.color = null;
		//this(null);
	}
	
	public Shape(String color) {
		this.color = color;
	}
	
	//abstract method
	public abstract double getArea();
	
	//method return string in form "color = "
	public String toString() {
		return "Color = "+ this.color;
	}
}
