package LeapYearCalculator;

public class LeapYearCalc {

    public boolean calculateYearsUnder999(int year) {
        if (year > 0 && year < 1000){
            return true;
        }else {
            return false;
        }
    }
    public boolean calculateLeapYearsBelow1000(int year) {
        if (year > 0 && year < 1000 && year % 4 == 0){
           return true;  
        }else if (year > 0 && year < 1000 && year % 4 != 0){
            return true;
        }
        return false;
    }
    public boolean calculateYearsOver999(int year) {
        if (year > 999 && year < 10000 && year % 400 ==0 && year % 100 ==0){
            return true;
        }else if (year > 999 && year < 10000 && year % 400 !=0 && year % 100 !=0){
            return true;
        }else if (year > 999 && year < 10000 && year % 400 !=0 && year % 100 ==0){
            return true;
        }
        return false;
}
}
