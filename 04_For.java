// for문의 구조
String[] numbers = {"one", "two", "three"};
for(int i=0; i<numbers.length; i++) {
    System.out.println(numbers[i]);
}
/*
one
two
three
*/

// for문의 조건문
 for (초기치; 조건문; 증가치) {
    ...
 }

//“총 5명의 학생이 시험을 보았는데 시험점수가 60점이 넘으면 합격이고 그렇지 않으면 불합격이다. 합격, 불합격을 판단하여 출력하시오.”
int[] marks = {90, 25, 67, 45, 80};
for(int i=0; i<marks.length; i++) {
    if (marks[i] >= 60) {
        System.out.println((i+1)+"번 학생은 합격입니다.");
    } else {
        System.out.println((i+1)+"번 학생은 불합격입니다.");
    }
}

/*
for와 continue
for문 앞의 문장을 수행하는 도중에 continue문을 만나면 for문의 처음으로 돌아간다.
ex. 60점 이상인 사람에게 축하 메시지 보내기
*/
int[] marks = {90, 25, 67, 45, 80};
for(int i=0; i<mark.length; i++) {
    if (marks[i] < 60) {
        continue;   // 조건문으로 돌아간다.
    }
    System.out.println((i+1)+"번 학생 축하합니다. 합격입니다");
}

// 이중 for문 (for문을 두 번 이용하여 구구단 출력)
for(int i=2; i<10; i++){
    for(int j=1; j<10; j++) {
        System.out.print(i*j+" ");
    }
    System.out.println("");     // 줄을 바꾸어 출력하는 역할
}
/*
2 4 6 8 10 12 14 16 18 
3 6 9 12 15 18 21 24 27 
4 8 12 16 20 24 28 32 36 
5 10 15 20 25 30 35 40 45 
6 12 18 24 30 36 42 48 54 
7 14 21 28 35 42 49 56 63 
8 16 24 32 40 48 56 64 72 
9 18 27 36 45 54 63 72 81
*/