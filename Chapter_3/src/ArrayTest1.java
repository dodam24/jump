
public class ArrayTest1 {

	public static void main(String[] args) {
		
		int[] s = new int[10];	//크기가 10인 배열 생성 
		
		for(int i=0; i<s.length; i++) {
			s[i] = i;	//i번째 요소에 i 저장
		}
		
		for(int i=0; i<s.length; i++) {		//반복문을 이용하여 배열의 요소 출력
			System.out.print(s[i] + " ");
		}
	}

}
