/* 
배열: 크기가 정해져 있음
리스트: 크기가 정해져 있지 않아 원하는 만큼의 값을 담을 수 있음
        동적으로 자료형의 갯수가 변할 경우, List를 사용
*/

//add
import java.util.ArrayList;     //ArrayList를 사용하기 위해 ArrayList를 먼저 import한다.

public class Sampe {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");     //첫 번째 위치에 133 삽입: pitches.add(0, "133");
        pitches.add("129");
        pitches.add("142");
    }
}

//get
import java.util.ArrayList;     //ArrayList를 사용하기 위해 ArrayList를 먼저 import한다.

public class Sampe {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches.get(1));     //2번째 pitches값 출력
    }
}


//size: ArrayList의 갯수 리턴
System.out.println(pitches.size());     //3 (pitches에 담긴 갯수 출력)

//contains: 리스트 안에 해당 항목이 있는지 판별하여, 그 결과를 boolean으로 리턴
System.out.println(pitches.remove("142"));   //true

//remove    1.객체  2.인덱스
System.out.println(pitches.remove("129"));   //"129"라는 항목이 삭제되고 true를 리턴

System.out.println(pitches.remove(0));      //"138"이 삭제된 후 138 리턴

//String.join("구분자", 리스트객체)
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
     public static void main(String[] args) {
        ArrayList<String> pirches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = String.join(",", pitches);
        System.out.println(result);     //138,129,142 출력
     }
}

//리스트 정렬
import java.util.Comparator;

public class Sample {
    public static void main(String[] args) {
        pitches.sort(Comparator.naturalOrder());    //오름차순으로 정렬
        System.out.println(pitches);    //[129, 138, 142]] 출력

        pitches.sort(Comparator.reverseOrder());    //내림차순으로 정렬
        System.out.println(pitches);    //[142, 138, 129]] 출력
    }
}
