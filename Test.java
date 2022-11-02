package swetha;

public class Test {

	public static void main(String[] args) {
		
		//Objects:
		
		Mobile mobile = new Mobile();
		
		mobile.color ="Blue";
		mobile.price= 1200;
		mobile.brand ="Vivo";
		mobile.ramSize = 1;
		System.out.println(mobile);
		Mobile mobile2 = new Mobile();
		System.out.println("This is mobile 2 "+mobile2);
		mobile2.ramSize = 2;
		mobile.displayHello();
		String brand = mobile.getBrand();
		mobile.displayMyName("Dhinesh");
		System.out.println("The mobile brand is" + brand);
		System.out.println(mobile);
		
		//Inheritance:
		
		
	}
}
