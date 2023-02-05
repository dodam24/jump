/*
형변환: 자료형의 타입을 변경
ex. "123"과 같은 문자열을 123과 같은 숫자형으로 바꾸는 것
*/
String num = "123"; -> //문자열을 정수(integer)로 바꾸기 위해 Integer 클래스 사용

public class Sample {
    public static void main(String[] args) {
        int n = Integer.parseInt(num);
        System.out.println(n);  //123 출력

        String num = "123.456"; 
        double d = Double.parseDouble(num);     //Double.parseDouble 또는 Float.parseFloat 형태도 가능
        System.out.println(d);
    }
}

//정수 123을 문자열 "123"으로 바꾸기 (1. 정수 앞에 빈 문자열("") 더하기)
public class Sample {
    public static void main(String[] args) {
        int n = 123;
        String num = "" + n;
        System.out.println(num);    //123 출력
    }
}

//2. String.valueOf(정수), Integer.toString(정수) 이용
public class Sample {
    public static void main(String[] args) {
        int n = 123;
        String num1 = String.valueOf(n);
        String num2 = Integer.toString(n)
        System.out.println(num1);    //123 출력
        System.out.println(num2);    //123 출력
    }
}

//정수와 실수 사이의 형 변환 (자주 사용하지는 않음)
public class Sample {
    public static void main(String[] args) {
        int n1 = 123;
        double d1 = n1;     //정수를 실수로 바꿀 때, 캐스팅 필요없음
        System.out.println(d1);

        double d2 = 123.456;
        int n2 = (int) d2;  //실수를 정수로 바꿀 때, 반드시 정수형으로 캐스팅해야 함!
        System.out.println(n2);     //소숫점 생략된 123 출력
    }
}

//final: 자료형에 값을 단 한 번만 설정 가능
public class Sample {
    public static void main(String[] args) {
        final int n = 123;      //final로 설정하면 값을 바꿀 수 없다.
        n = 456;    //컴파일 에러 발생

    }
}

/*
Unmodifiable List
리스트의 경우, final로 선언 시 리스트에 값을 더하거나(add) 빼는(remove) 것은 가능
다만 재할당은 불가능
만약 값을 더하거나 빼는 것도 불가능하게 하고 싶은 경우, List.of로 수정 불가능한 리스트(Ummodifiable List) 사용
*/
public class Sample {
    public static void main(String[] args) {
        final List<string> a = List.of("a", "b");
        a.add("C");     //UnsupportedOperationExcception 발생
    }
}
