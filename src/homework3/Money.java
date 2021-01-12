package homework3;

import java.math.BigDecimal;
import java.math.MathContext;

public class Money {
    private long hrn;
    private byte cent;

    public Money(long hrn, byte cent){
        this.hrn = hrn;
        this.cent = cent;
    }

    public void sum(Money money){
        BigDecimal money1 = new BigDecimal(money.hrn).multiply(BigDecimal.valueOf(100)).add(new BigDecimal(money.cent));
        BigDecimal money2 = new BigDecimal(hrn).multiply(BigDecimal.valueOf(100)).add(new BigDecimal(cent));
        BigDecimal result = money1.add(money2).divide(BigDecimal.valueOf(100));
        System.out.println(String.format("Adding %d,%d UAH to %d,%d UAH.  Result: %.2f UAH", hrn, cent, money.hrn, money.cent, result));
    }

    public void substract(Money money){
        BigDecimal money1 = new BigDecimal(hrn).multiply(BigDecimal.valueOf(100)).add(new BigDecimal(cent));
        BigDecimal money2 = new BigDecimal(money.hrn).multiply(BigDecimal.valueOf(100)).add(new BigDecimal(money.cent));
        BigDecimal result = money1.subtract(money2).divide(BigDecimal.valueOf(100));
        System.out.println(String.format("Substraction %d,%d UAH from %d,%d UAH.  Result: %.2f UAH", money.hrn, money.cent, hrn, cent, result));
    }

    public void multiply(Money money){
        BigDecimal money1 = new BigDecimal(hrn).multiply(BigDecimal.valueOf(100)).add(new BigDecimal(cent));
        BigDecimal money2 = new BigDecimal(money.hrn).multiply(BigDecimal.valueOf(100)).add(new BigDecimal(money.cent));
        BigDecimal result = money1.multiply(money2).divide(BigDecimal.valueOf(10000));
        System.out.println(String.format("Myltiply %d,%d UAH with %d,%d UAH.  Result: %.2f UAH", hrn, cent, money.hrn, money.cent, result));
    }

    public void divide(Money money){
        BigDecimal money1 = new BigDecimal(hrn).multiply(BigDecimal.valueOf(100)).add(new BigDecimal(cent));
        BigDecimal money2 = new BigDecimal(money.hrn).multiply(BigDecimal.valueOf(100)).add(new BigDecimal(money.cent));
        BigDecimal result = money1.divide(money2, new MathContext(3));
        System.out.println(String.format("Dividing %d,%d UAH with %d,%d UAH.  Result: %.2f UAH", hrn, cent, money.hrn, money.cent, result));
    }
}
