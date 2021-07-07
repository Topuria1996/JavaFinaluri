package com.example.NodarTopuria1;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.NodarTopuria1.CurrencyConverter")
public class CurrencyConverterImpl implements CurrencyConverter{

    @Override
    public Double convert(Double value, String fromCode, String toCode) {
        return null;
    }
}
