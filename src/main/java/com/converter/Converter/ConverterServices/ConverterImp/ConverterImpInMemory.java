package com.converter.Converter.ConverterServices.ConverterImp;

import com.converter.Converter.ConverterServices.Converter;
import org.springframework.stereotype.Service;

@Service
public class ConverterImpInMemory implements Converter {
    @Override
    public double CelsiusToFahrenheit(double inp) {
        return (inp*9/5)+32;
    }

    @Override
    public double FahrenheitToCelsius(double inp) {
        return (inp-32)*5/9;
    }
}
