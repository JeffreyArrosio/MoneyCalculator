package moneycalculator.mocks;

import moneycalculator.model.Currency;
import moneycalculator.model.Money;
import java.util.List;
import moneycalculator.ui.MoneyDialog;

public class MockMoneyDialog implements MoneyDialog {

    @Override
    public Money query(List<Currency> currencyList) {
        return new Money(50, currencyList.get(0));
    }

}
