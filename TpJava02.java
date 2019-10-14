
public class TpJava02 {

	public static void main(String[] args) {
		
		System.out.println("----- PART 1 ------");
		//Convertir un entier en float 
		int x1 = 1234;
		int x2 = 123456798;

		float y1 = x1;
		float y2 = x2;

		System.out.println("x1 = "+ x1 + " y1 ="+ y1);
		System.out.println("x2 = "+ x2 + " y2 ="+ y2);
		
		System.out.println("----- PART 2 ------");

		float x = 15f;
		float z = 0f;
		float y = -123f;
		
		float a = x/z;
		float b = y/z;
		float c = a/b;
		
		System.out.println("x = " + x);
		System.out.println("z = " + z);
		System.out.println("y = " + y);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

}
