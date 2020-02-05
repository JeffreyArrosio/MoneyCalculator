package moneycalculator.actions;

import moneycalculator.model.ExchangeRate;
import moneycalculator.model.Currency;
import moneycalculator.model.Money;
import java.util.List;
import moneycalculator.persistence.CurrencyLoader;
import moneycalculator.persistence.ExchangeRateLoader;
import moneycalculator.ui.MoneyDialog;
import moneycalculator.ui.MoneyDisplay;

public class ExchangeToEuroAction implements Action {
    private final CurrencyLoader currencyLoader;
    private final ExchangeRateLoader exchangeRateLoader;
    private final MoneyDialog moneyDialog;
    private final MoneyDisplay moneyDisplay;
    private Currency EURO = new Currency("EUR", "Euro", "€");

    public ExchangeToEuroAction(CurrencyLoader currencyLoader, ExchangeRateLoader exchangeRateLoader, MoneyDialog moneyDialog, MoneyDisplay moneyDisplay) {
        this.currencyLoader = currencyLoader;
        this.exchangeRateLoader = exchangeRateLoader;
        this.moneyDialog = moneyDialog;
        this.moneyDisplay = moneyDisplay;
    }

    @Override
    public void execute() {
        List<Currency> currencyList = currencyLoader.load();
        Money money = moneyDialog.query(currencyList);
        ExchangeRate exchangeRate = exchangeRateLoader.load(money.getCurrency(), EURO);
        Money result = exchangeRate.exchange(money);
        moneyDisplay.display(result);
    }

}
