package moneycalculator.model;

import moneycalculator.model.Money;
import java.util.Date;

public class ExchangeRate {
    private final Currency from;
    private final Currency to;
    private final Date date;
    private final double value;

    public ExchangeRate(Currency from, Currency to, Date date, double value) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.value = value;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public Date getDate() {
        return date;
    }

    public double getValue() {
        return value;
    }
    
    public Money exchange(Money money) {
        return new Money(money.getAmount() * value, to);
    }
    
    

}
