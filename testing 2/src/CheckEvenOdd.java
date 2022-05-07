public class CheckEvenOdd {
    public String check(int no){
        if ( no < 0)
            throw new IllegalArgumentException("Weight have to be higher than 0");
        if(no%2==0)
            return "weight is even";
        else
            return "weight is odd";
    }
}

