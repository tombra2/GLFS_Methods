package at.htl.klu.methods;

import java.time.LocalDateTime;

public class Greetings {
	public static void main(String[] args) {
		
		
		sayHelloTime();
	}
	
	
	public static void sayHello (int a){
		
		if (a >0 && a < 5) {
			System.out.println("Es ist Nacht");
		} else if (a >= 6 && a < 11) {
			System.out.println("Guten Morgen");
		} else if (a >=11 && a < 15) {
			System.out.println("Mahlzeit");
		} else if (a >=15 && a < 20) {
			System.out.println("Guten Tag");
		} else if (a >=20 && a < 23) {
			System.out.println("Gute Nacht");
		} else if (a >= 23){
			System.out.println("Falsche Zeitangabe");
		} else {
			System.out.println("Falsche Zeitangabe");
		}
		
		
	}
	
	public static void sayHelloTime() {
		
		int hours = LocalDateTime.now().getHour();
		sayHello(hours);
	}
	
	
}

