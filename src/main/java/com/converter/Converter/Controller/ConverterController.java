package com.converter.Converter.Controller;

import com.converter.Converter.ConverterServices.Converter;
import com.converter.Converter.model.Data;
import org.json.JSONObject;
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
    public Data ConvertFahrenheitToCelsius(@PathVariable("value") double value){
        Data json = new Data("FahrenheitToCelsius",value,con.FahrenheitToCelsius(value));
        System.out.println(json);
        return json;
    }

    @RequestMapping(value = "/celsius/{value}",method = RequestMethod.GET)
    public Data ConvertCelsiusToFahrenheit( @PathVariable("value") double value){
        Data json = new Data("CelsiusToFahrenheit",value,con.CelsiusToFahrenheit(value));
        System.out.println(json);
        return json;
    }


}
