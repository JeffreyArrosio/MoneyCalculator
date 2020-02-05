package moneycalculator.mocks;

import moneycalculator.model.Currency;
import java.util.ArrayList;
import java.util.List;
import moneycalculator.persistence.CurrencyLoader;

public class MockCurrencyLoader implements CurrencyLoader {

    @Override
    public List<Currency> load() {
        List<Currency> list = new ArrayList<>();
        list.add(new Currency("USD","Dolar americano","$"));
        list.add(new Currency("GBP","Libra esterlina","£"));
        return list;
    }

}
