package homework3;

public class Fractions {
    private long intPart;
    private Short decimalPart;

    public Fractions(double number) {
        intPart = (long) number;
        String stringNumber = String.format("%.2f", number);
        String stringDecimal = stringNumber.split(",")[1];
        decimalPart = Short.valueOf(stringDecimal);
    }


    public void sum(Fractions numberSet) {
        long intSum =  intPart + numberSet.intPart;
        short decimalSum =0;
        if ((intPart <= 0 && numberSet.intPart <= 0) || (intPart >=0 && numberSet.intPart >= 0)) {
            decimalSum = (short) (decimalPart + numberSet.decimalPart);
            if (decimalSum > 100 && intSum > 0) {
                decimalSum = (short) (decimalSum - 100);
                intSum++;
            } else if (decimalSum > 100 && intSum < 0){
                decimalSum = (short) (decimalSum - 100);
                intSum--;
            }
        }
        else if (intPart >= 0 && numberSet.intPart <=0) {
            decimalSum = (short) (decimalPart - numberSet.decimalPart);
        } else if (intPart < 0 && numberSet.intPart > 0){
            decimalSum = (short) (numberSet.decimalPart - decimalPart);
        }
        if (decimalSum < 0 && intSum < 0) {
            decimalSum = (short) (-decimalSum);
        } else if (decimalSum < 0 && intSum > 0) {
            intSum--;
            decimalSum = (short) (-decimalSum);
        }
        System.out.println(String.format("Sum of %d.%02d and %d.%02d is %d.%02d",
                intPart, decimalPart, numberSet.intPart, numberSet.decimalPart, intSum, decimalSum));
    }

    public void multiply(Fractions numberSet){
        long number1 = Long.parseLong("" + intPart + String.format("%02d", decimalPart));
        long number2 = Long.parseLong("" + numberSet.intPart + String.format("%02d", numberSet.decimalPart));
        double result = (number1 * number2) / 10000f;
        long intResult = (long) result;
        String stringNumber = String.format("%.2f", result);
        String stringDecimal = stringNumber.split(",")[1];
        short decimalResult = Short.valueOf(stringDecimal);
        System.out.println(String.format("Multyply of %d.%02d and %d.%02d is %d.%02d",
                this.intPart, this.decimalPart, numberSet.intPart, numberSet.decimalPart, intResult, decimalResult));
    }
}
