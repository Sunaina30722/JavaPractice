class Rectangle {
    public float length;
    public float width;
    
    public double calculateArea() {
        double area = Math.round(length * width*100.0)/100.0;
        return area;
    }
    
    public double calculatePerimeter() {
        double perimeter = Math.round(2 * (length + width) * 100.0) / 100.0;
        return perimeter;
    }
    //Implement your code here    
}

class Tester {

	public static void main(String args[]) {
		
		Rectangle rectangle = new Rectangle();
		rectangle.length = 12F;
		rectangle.width = 5F;
		//Assign values to the member variables of Rectangle class
		
		//Invoke the methods of the Rectangle class to calculate the area and perimeter
		
		//Display the area and perimeter using the lines given below
		System.out.println("Area="+ rectangle.calculateArea());
		System.out.println("Perimeter=" + rectangle.calculatePerimeter());
	}

}