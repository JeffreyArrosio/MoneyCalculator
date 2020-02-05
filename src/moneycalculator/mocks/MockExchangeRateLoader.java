package moneycalculator.mocks;

import moneycalculator.model.ExchangeRate;
import moneycalculator.model.Currency;
import java.util.Date;
import moneycalculator.persistence.ExchangeRateLoader;

public class MockExchangeRateLoader implements ExchangeRateLoader{

    @Override
    public ExchangeRate load(Currency from, Currency to) {
        return new ExchangeRate(from, to, new Date(), 0.62);
    }

}
