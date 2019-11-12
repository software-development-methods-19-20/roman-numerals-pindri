package dssc.roman;

public class RomanNumeral {
    final private int decimal;

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        if (decimal == 0) {
            return "";
        } else {
            return "I".repeat(decimal);
        }
    }

}
