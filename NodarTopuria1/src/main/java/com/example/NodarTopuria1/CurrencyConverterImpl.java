package com.example.NodarTopuria1;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.example.NodarTopuria1.CurrencyConverter")
public class CurrencyConverterImpl implements CurrencyConverter{

    @Override
    public List<Double> convert(Double value, String fromCode) {
        Double convertedGel = 0.0;
        Double convertedEuro = 0.0;
        Double convertedUsd = 0.0;
        List<Double> converted = new ArrayList<>();
      
        switch(fromCode){
            case "USD":
                convertedGel = value * 3.16;
                convertedEuro = value * 0.85;
                converted.add(convertedGel);
                converted.add(convertedEuro);
                break;
            case "GEL":
                convertedUsd = value * 0.32;
                convertedEuro = value * 0.27;
                converted.add(convertedUsd);
                converted.add(convertedEuro);
                break;
            case "EURO":
                convertedGel = value * 3.72;
                convertedUsd = value * 1.18;
                converted.add(convertedGel);
                converted.add(convertedUsd);
                break;
        }
        return converted;
    }
}
