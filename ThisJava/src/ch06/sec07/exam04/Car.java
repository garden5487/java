package ch06.sec07.exam04;

public class Car {
   //필드 선언
	
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	//생산자 선언
	Car() {}
	
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
		
	}
	
	Car(String model, String color, int maxspeed) {
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
		
	}
	
}
