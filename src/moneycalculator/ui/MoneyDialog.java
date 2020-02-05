package moneycalculator.ui;

import moneycalculator.model.Currency;
import moneycalculator.model.Money;
import java.util.List;

public interface MoneyDialog {
    
    Money query(List<Currency> currencyList);

}
