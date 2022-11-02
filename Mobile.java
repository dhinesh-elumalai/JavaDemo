package swetha;

public class Mobile {

	String color ;
	String brand;
	int price;
	static int ramSize;
	
	{
		System.out.println("I am static block");
	}
	
	Mobile(){
		System.out.println("Hi Hello");
	}
	
	Mobile(String col){
		this.color = col;
	}
	
	Mobile(String color, String price){
		
	}
	
	
	public void displayHello() {
		String localVaribale= "hello";
		System.out.println("Welcome Dhinesh");
	}
	
	 String getBrand() {
		return brand;
	}
	
	protected void displayMyName(String name) {
		System.out.println("Welcome "+ name);
	}
	
	@Override
	public String toString() {
		return "Mobile [color=" + color + ", brand=" + brand + ", price=" + price + ", ramSize=" + ramSize + "]";
	}
	
}
