package com.example.NodarTopuria1;

import javax.jws.*;
import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        try {
            Endpoint.publish("https://localhost:9999/ws/currencyConverter",new CurrencyConverterImpl());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
