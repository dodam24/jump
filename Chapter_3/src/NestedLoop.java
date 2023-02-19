
public class NestedLoop {

	public static void main(String[] args) {

		for(int y=0; y<5; y++) { //5줄
			
			for(int x=0; x<10; x++) //10개
				System.out.print("*");
			
			System.out.println("");
		}
	}
}
