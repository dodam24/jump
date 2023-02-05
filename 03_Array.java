//1부터 10까지의 숫자들 중 홀수들의 집합을 int 배열로 표현
int[] odds = {1, 3, 5, 7, 9};

String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

//배열의 길이는 고정
String[] weeks = new String[7];
weeks[0] = "월";
weeks[1] = "화";
weeks[2] = "수";
weeks[3] = "목";
weeks[4] = "금";
weeks[5] = "토";
weeks[6] = "일";

String[] weeks = new String[];  //길이에 대한 숫자값이 없으므로 컴파일 오류 발생

//배열의 값에 접근
String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
System.out.println(weeks[3]);   //목

/* 
배열의 길이:
배열은 보통 for문과 함께 사용
for문에 배열이 사용될 경우, 배열의 길이만큼 for문을 반복
배열의 길이는 length를 이용하여 구한다.
*/

String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
for (int i=0; i < weeks.length; i++) {      //weeks.length는 weeks 배열의 길이인 7을 리턴
    System.out.println(weeks[i]);
}
/*
월
화
수
목
금
토
일
*/

//배열의 오류: ArrayIndexOutOfBoundsException
System.out.println(weeks[7]);   //8번째 배열값이 없으므로 에러 발생
