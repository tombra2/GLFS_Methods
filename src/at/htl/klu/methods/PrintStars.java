package at.htl.klu.methods;

public class PrintStars {
	public static void main(String[] args) {
		printFiveStars();
		
		printStars(5);
	}
	
	public static void printFiveStars() {
		System.out.println("*****");
	}
	
	
	public static void printStars(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
	}
}