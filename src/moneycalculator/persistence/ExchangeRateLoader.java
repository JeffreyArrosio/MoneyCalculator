package moneycalculator.persistence;

import moneycalculator.model.ExchangeRate;
import moneycalculator.model.Currency;

public interface ExchangeRateLoader {
    
    ExchangeRate load(Currency from, Currency to);

}
