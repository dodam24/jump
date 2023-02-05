/*
while문은 문장을 반복 수행할 경우에 사용
조건문이 참인 동안 while문의 수행할 문장들을 반복하여 수행
*/
while (조건문) {
    수행할 문장1;
    수행할 문장2;
    수행할 문장3;
    ...
}

//"열 번 찍어 안 넘어가는 나무 없다"
int treeHit = 0;
while (treeHit < 10) {
    treeHit++;
    System.out.println("나무를 " + treeHit + "번 찍었습니다.");
    if (treeHit == 10) {
        System.out.println("나무 넘어갑니다.");
    }
}
/*
나무를  1번 찍었습니다.
나무를  2번 찍었습니다.
나무를  3번 찍었습니다.
나무를  4번 찍었습니다.
나무를  5번 찍었습니다.
나무를  6번 찍었습니다.
나무를  7번 찍었습니다.
나무를  8번 찍었습니다.
나무를  9번 찍었습니다.
나무를  10번 찍었습니다.
나무 넘어갑니다.
*/

//무한루프
while (true) {
    수행할 문장1;
    수행할 문장2;
    ...
}

// while문 빠져 나가기(break)
int coffee = 10;
int money = 300;

while (money > 0) {
    System.out.println("돈을 받았으니 커피를 줍니다.");
    coffee--;
    System.out.println("남은 커피의 양은 " + coffee + "입니다.");
    if (coffee == 0) {
        System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
        break;
    }
}

/*
while문 조건문으로 돌아가기(continue)
조건에 맞지 않는 경우, while문을 빠져나가는 대신 while문의 맨 처음(조건문)으로 돌아가기
ex. 1부터 10까지의 수 중에서 홀수만을 출력
*/
int a = 0;
while (a < 10) {
    a++;
    if (a % 2 == 0) {
        continue;   //짝수인 경우 조건문으로 돌아간다.
    }
    System.out.println(a);  //홀수만 출력
}
