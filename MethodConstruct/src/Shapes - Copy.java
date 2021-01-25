

class differentShapes {
	double length;
	double width;
	double height;

	public double calcAreaSquare(double base , double wide) {
		length = base;
		width = wide;
		double area = length * width;
		return area;
		
	}
	public double calcVolumeBox(double base, double wide, double tall) {
		length = base;
		width = wide;
		height = tall;
		double box = length * width * height;
		return box;
	}
}
public class Shapes {

	public static void main(String[] args) {	
		differentShapes square = new differentShapes();
	
		double c = square.calcAreaSquare(10, 5);
		double d = square.calcVolumeBox(10, 10, 10);
		
		System.out.println("Square area: " + c);
		System.out.println("Box volume: " + d);
	}

}
