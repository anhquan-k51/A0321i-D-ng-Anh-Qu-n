package Access_modifier_static_method_static_property.Bai_tap;

/**
 * Cricle
 */
public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public Circle() {
	}
	
	public Circle(double r){
		this.radius = r;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public double getArea(){
		return this.radius*this.radius*Math.PI;
	}
	
	public static void main(String[] args) {
		Circle obj = new Circle(4);
		System.out.print("r = "+obj.getRadius());
		System.out.print("\narea = "+obj.getArea());
	}
	
}