package object_;

	class Calculator {
		int result = 0;
		
		int add(int num) { // add 메서드: 매개변수 num으로 받은 값을 이전에 계산한 결괏값에 더한 후 반환
			result += num;
			return result;
		}
		
		int sub(int num) {
			result -= num;
			return result;
		}
	}
	
public class Sample_object {

	public static void main(String[] args) {
		Calculator cal1 = new Calculator(); // 계산기1 객체 생성
		Calculator cal2 = new Calculator(); // 계산기2 객체 생성
		
		System.out.println(cal1.add(3));
		System.out.println(cal1.add(4));
		
		System.out.println(cal2.add(3));
		System.out.println(cal2.add(7));

	}

}
