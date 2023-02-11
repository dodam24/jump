package object_;

class Animal{
	String name; // Animal 클래스에 name 이라는 String 변수 추가 (객체 변수)
	
	public void setName(String name) { // 입력: String name, 출력: void(리턴값 없음)
		
		this.name = name; // setName 메서드 호출 -> this.name = "bobby";
	}
}

public class AniSample {

	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.setName("bobby"); // setName 메서드 호출
		System.out.println(cat.name); 
	}

}
