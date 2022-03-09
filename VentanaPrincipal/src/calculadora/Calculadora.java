package calculadora;

public class Calculadora {
	public static void main(String args[]) {
		System.out.println("3 + 2 = " + suma(3,2));
		
		System.out.println("3 - 2 = " + resta(2,3));
	}
	
	static int suma(int a, int b) {
		return a+b;
	}
	
	static int resta(int a, int b) {
		return a-b;
	}
}
