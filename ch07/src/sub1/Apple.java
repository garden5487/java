package sub1;

public class Apple { //암묵적으로 object 클래스를 상속

	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
		
	}

	@Override // 우클릭, source -> Generrat string 으로 생성
	public String toString() {
	return "Apple [country=" + country + ", price=" + price + "]";
	}

   

}
