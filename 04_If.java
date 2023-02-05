//"돈이 있으면 택시를 타고 가고 돈이 없으면 걸어 간다."
boolean money = true;
if (money) {
    System.out.println("택시를 타고 가라");
}else {
    System.out.println("걸어가라");
}

// if문의 기본 구조
/*
if (조건문) {
    수행할 문장1;
    수행할 문장2;
    ...
} else {
    수행할 문장A;
    수행할 문장B;
    ...
}
*/

//비교연산자
x!= y   //x와 y가 같지 않다
int x = 3;
int y = 2;
System.out.println(x != y);     //true

//"만약 3000원 이상의 돈을 가지고 있으면 택시를 타고 그렇지 않으면 걸어가라"
int money = 2000;
if (money >= 3000) {
    System.out.println("택시를 타고 가라");
} else {
    System.out.println("걸어가라");
}

// and(&&), or(||), not(!)
//"돈이 3000원 이상 있거나 카드가 있다면 택시를 타고 그렇지 않으면 걸어가라"
int money = 2000;
boolean hasCard = true;

if (money>=3000 || hasCard) {
    System.out.println("택시를 타고 가라");
} else {
    System.out.println("걸어가라");
}

// contains: List 자료형에 해당 아이템이 있는지 확인
//"만약 주머니에 돈이 있으면 택시를 타고, 없으면 걸어가라“
ArrayList<String> pocket = new ArrayList<String>();
pocket.add("paper");
pocket.add("handphone");
pocket.add("money");

if (pocket.contains("money")) {
    System.out.println("택시를 타고 가라");
} else {
    System.out.println("걸어가라");
}

/*
else if (다중 조건 판단)
"지갑에 돈이 있으면 택시를 타고, 지갑엔 돈이 없지만 카드가 있으면 택시를 타고, 돈도 없고 카드도 없으면 걸어가라“
if와 else만으로 문장 표현
*/
boolean hasCard = true;
ArrayList<String> pocket = new ArrayList<String>();
pocket.add("paper");
pocket.add("handphone");

if (pocket.contains("money")) {
    System.out.println("택시를 타고 가라");
}else {
    if (hasCard) {
        System.out.println("택시를 타고 가라");
    }else {         
        System.out.println("걸어가라");
    }
}

// else if문 적용
boolean hasCard = true;
ArrayList<String> pocket = new ArrayList<String>();
pocket.add("paper");
pocket.add("handphone");

if (pocket.contains("money")) {
    System.out.println("택시를 타고 가라");
} else if(hasCard) {
    System.out.println("택시를 타고 가라");
} else {         
    System.out.println("걸어가라");
}


//if, else if, else의 기본 구조:
/*
if (조건문) {
    수행할 문장1 
    수행할 문장2
    ...
} else if (조건문) {
    수행할 문장1
    수행할 문장2
    ...
} else if (조건문) {
    수행할 문장1
    수행할 문장2
    ...
...
} else {
   수행할 문장1
   수행할 문장2
   ... 
}
*/