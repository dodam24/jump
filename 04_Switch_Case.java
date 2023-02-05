switch(입력변수) {
    case 입력값1: ...
        break;
    case 입력값2: ...
        break;
    ...
    default: ...
        break;

}

/*
입력변수 값과 일치하는 case 입력값이 있다면 해당 case문에 속한 문장들이 실행된다.
break: 해당 case문을 실행 한 뒤 siwtch문을 빠져나감
        만약 break문이 없다면 그 다음의 case문이 실행된다.      
*/

public class Sample {
    public static void main(String[] args) {
        int month = 8;
        String monthString = "";
        switch (month) {
            case1: monthString = "January";
                    break;
            case2: monthString = "February";
                    break;
            case3: monthString = "March";
                    break;
            case4: monthString = "April";
                    break;
            case5: monthString = "May";
                    break;
            case6: monthString = "June";
                    break;
            case7: monthString = "July";
                    break;
            case8: monthString = "August";
                    break;
            case9: monthString = "September";
                    break;
            case10: monthString = "October";
                    break;
            case11: monthString = "November";
                    break;
            case12: monthString = "December";
                    break;
            default: monthString = "Invalid month";
                    break;
        }
        System.out.println(monthString);
    }
}
