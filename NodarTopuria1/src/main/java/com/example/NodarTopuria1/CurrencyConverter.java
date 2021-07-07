package com.example.NodarTopuria1;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface CurrencyConverter {

    @WebMethod
     List<Double> convert(Double value,String fromCode);
}
