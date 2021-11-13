package leverxhomeworks.homeworkone.utills;

public class IsDigitValidator {
    public boolean CheckNumberIfItDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}