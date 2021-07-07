package com.example.NodarTopuria1;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CurrencyConverter {

    @WebMethod
     Double convert(Double value,String fromCode);
}
