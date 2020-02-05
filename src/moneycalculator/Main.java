package moneycalculator;

import java.io.File;
import moneycalculator.persistence.ExchangeRateLoader;
import moneycalculator.ui.MoneyDisplay;
import moneycalculator.ui.MoneyDialog;
import moneycalculator.persistence.CurrencyLoader;
import moneycalculator.mocks.*;
import moneycalculator.actions.*;
import moneycalculator.files.CsvFileCurrencyLoader;

public class Main {

    public static void main(String[] args) {
        new ExchangeToEuroAction(
                new CsvFileCurrencyLoader(new File("currencies.csv")), 
                new MockExchangeRateLoader(),
                new MockMoneyDialog(),
                new MockMoneyDisplay()
        ).execute();
    }
    
}
