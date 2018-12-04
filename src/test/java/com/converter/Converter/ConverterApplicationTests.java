package com.converter.Converter;

import com.converter.Converter.ConverterServices.Converter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.AssertTrue;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConverterApplicationTests {
	@Autowired
	Converter con;

	@Test
	public void contextLoads() {
	}

	@Test
	public void MustConvertCelsiusToFahrenheit(){
		HashMap<Double,Double>validation=new HashMap<>();
		validation.put(15.0,59.0);
		validation.put(42.0,107.6);
		validation.put(78.0,172.4);
		validation.put(5000.0,9032.0);
		ArrayList<Double> inp= new ArrayList<>(validation.keySet());
		boolean ok=true;
		for(int i=0;i<inp.size() && ok;i++){
			if(!(con.CelsiusToFahrenheit(inp.get(i))==validation.get(inp.get(i)))){
				ok=false;
			}
		}
		Assert.assertTrue(ok);

	}

	@Test
	public void MustConvertFahrenheitToCelsius(){
		HashMap<Double,Double>validation=new HashMap<>();
		validation.put(59.0,15.0);
		validation.put(107.6,42.0);
		validation.put(172.4,78.0);
		validation.put(9032.0,5000.0);
		ArrayList<Double> inp= new ArrayList<>(validation.keySet());
		boolean ok=true;
		for(int i=0;i<inp.size() && ok;i++){
			if(!(con.FahrenheitToCelsius(inp.get(i))==validation.get(inp.get(i)))){
				ok=false;
			}
		}
		Assert.assertTrue(ok);

	}

}
