class Pizza
{
	int size;
	String type;
	
	public Pizza() {	// 매개변수 없는 생성자
		size = 12;
		type = "슈퍼슈프림";
	}
	
	public Pizza(int s, String t) {	// 매개변수 있는 생성자
		// 생성자에서 s와 t라는 매개변수 정의, size와 type 필드 초기화 (객체가 new에 의하여 생성될 때, 24는 s로, "포테이토" 값은 t로 전달)
		size = s;	
		type = t;
	}
}

public class PizzaTest {
	public static void main(String[] args) {
		Pizza obj1 = new Pizza();
		System.out.println("("+obj1.type+" , "+obj1.size+",)");
		
		Pizza obj2 = new Pizza(24, "포테이토");
		System.out.println("("+obj2.type+" , "+obj2.size+",)");

	}

}
