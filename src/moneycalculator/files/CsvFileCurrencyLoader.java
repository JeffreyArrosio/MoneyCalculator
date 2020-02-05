package moneycalculator.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import moneycalculator.model.Currency;
import moneycalculator.persistence.CurrencyLoader;

public class CsvFileCurrencyLoader implements CurrencyLoader{
    private final File file;

    public CsvFileCurrencyLoader(File file) {
        this.file = file;
    }
    
    @Override
    public List<Currency> load() {
        List<Currency> list = new ArrayList<>(); 
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.readLine();
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                String[] data = line.split(";");
                list.add(new Currency(data[0], data[1], data[2]));
            }
        } catch (IOException ex) {
        }
        return list;
    }

}
