package ke_thua.Bai_tap;

public class Point3D extends Point2D {
	private float z ;
	
	public Point3D() {
	
	}
	
	public Point3D(float x, float y , float z) {
		super(x,y);
		this.z = z;
	}
	
	public float getZ() {
		return this.z;
	}
	
	public void setZ(float z) {
		this.z = z;
	}
	
	public void setXYZ(float x,float y, float z) {
		setXY(x, y);
		this.z = z;
	}
	
	public float [] getXYZ () {
		float []array = new float[3];
		array[0] = getX();
		array[1] = getY();
		array[2] = this.z;
		return array;
	}
	
	public String toString() {
		return "(x,y,z) = "+"(" + super.getX() + "," + super.getY() + "," + this.z + ")"; 
	}
}