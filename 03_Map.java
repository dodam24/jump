//put

import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {
        map.put("people", "사람");
        map.put("baseball", "야구");
    }
}

//get: key에 해당하는 value값 얻기
System.out.println(map.get("people"));  //"사람" 출력
System.out.println(map.get("java"));  //null 출력
//null 대신 디폴트 값을 얻고 싶은 경우, getOrDefault 메서드 사용
System.out.println(map.get("java", "자바"));  //"자바" 출력

//containsKey: 맵에 해당 key가 있는지 조사하여 참, 거짓으로 리턴
System.out.println(map.containsKey("people"));  //true 출력

//remove: key값에 해당되는 아이템(key, value)을 삭제한 후, 그 value값을 리턴
System.out.println(map.remove("people"));  //"people"에 해당하는 key, value 쌍이 삭제된 후, "사람" 출력

//size: Map의 갯수 리턴
System.out.println(map.size());  //"people", "baseball" 두 값을 가지고 있다가 "people"항목이 삭제되었으므로 1 출력

//keySet: 맵의 모든 key를 모아서 Set 자료형으로 리턴

import java.util.HashMap;

public class Sampe {
    public static void main(String[] args) {
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.keySet());   // [baseball, people] 출력

    }
}

/*
Map에 입력된 순서대로 데이터를 가져오고 싶은 경우:
LInkedHashMap: 입력된 순서대로 데이터를 저장
TreeMap: 입력된 key의 오름차순 순서로 데이터를 저장
*/
