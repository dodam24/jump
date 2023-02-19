
public class CircleTest {

	public static void main(String[] args) {
	
		Circle obj; //참조변수 생성 (객체를 참조하는 변수 obj 선언)
		obj = new Circle(); //객체 생성 후, 객체의 참조값(주소)을 참조 변수에 저장
		
		obj.radius = 100;
		obj.color = "blue";
		double area = obj.getArea();
		
		System.out.println("원의 면적=" + area);

	}

}
