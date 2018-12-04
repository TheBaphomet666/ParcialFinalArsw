package com.converter.Converter.Controller;

import com.converter.Converter.ConverterServices.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/Converter")
public class ConverterController {
    @Autowired
    Converter con;


    @RequestMapping(value = "/fahrenheit/{value}",method = RequestMethod.GET)
    public StringBuffer ConvertFahrenheitToCelsius( @PathVariable("value") double value){
            System.out.println("VALUE INPUT="+value);

        return null;
    }

    @RequestMapping(value = "/celsius/{value}",method = RequestMethod.GET)
    public StringBuffer ConvertCelsiusToFahrenheit( @PathVariable("value") double value){
        System.out.println("VALUE INPUT="+value);

        return null;
    }


}
