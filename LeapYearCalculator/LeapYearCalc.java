package LeapYearCalculator;

public class LeapYearCalc {

    public boolean calculateYearsUnder999(int year) {
        if (year > 0 && year < 1000){
            return true;
        }else {
            return false;
        }
}
    public void calculateLeapYearsBelow1000(int year) {
        if (year % 4 == 0){
            System.out.println("is a leap year");  
        }else if (year % 4 != 0){
            System.out.println("is NOT a leap year");
        }
    }
}
