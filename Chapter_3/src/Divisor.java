import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.println(n + "의 약수는 다음과 같습니다.");
		for(int i=1; i<=n; ++i) {
			if(n % i == 0)	// n을 i로 나누어서 나머지가 0이면
				System.out.print(" " + i);	// i를 약수로  출력
		}
	}

}
