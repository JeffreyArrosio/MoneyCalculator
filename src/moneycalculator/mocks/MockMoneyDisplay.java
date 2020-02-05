package moneycalculator.mocks;

import moneycalculator.ui.MoneyDisplay;
import moneycalculator.model.Money;

public class MockMoneyDisplay implements MoneyDisplay{

    @Override
    public void display(Money money) {
        System.out.println(money.getAmount() + " " + money.getCurrency().getSymbol());
    }

}
