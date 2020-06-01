package LeapYearCalculator;

public class LeapYearCalc {

    public boolean calculateYear(int year) {
        if (year > 0 && year < 1000){
            return true;
        }else {
            return false;
        }
}
}