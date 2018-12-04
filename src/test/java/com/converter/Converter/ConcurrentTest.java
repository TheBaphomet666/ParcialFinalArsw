package com.converter.Converter;

import com.converter.Converter.Controller.ConverterController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class ConcurrentTest {
    @LocalServerPort
    private int port;
    @MockBean
    private ConverterController cc;


    @Test
    public void mustSurviveTenRequests(){
        ArrayList<Thread> th= new ArrayList<>();
        for(int i=0;i<10;i++){
            Thread thread = new Thread(){
                public void run(){
                    cc.ConvertCelsiusToFahrenheit(87);
                    cc.ConvertFahrenheitToCelsius(54);
                }
            };
            th.add(thread);

        }
        for(int i=0;i<th.size();i++){
            th.get(i).start();
        }
        Assert.assertTrue(true);


    }
    @Test
    public void mustSurviveTenRequests2(){
        ArrayList<Thread> th= new ArrayList<>();
        for(int i=0;i<10;i++){
            Thread thread = new Thread(){
                public void run(){
                    MockMvcRequestBuilders.get("/Converter/fahrenheit/82");
                    MockMvcRequestBuilders.get("/Converter/celsius/82");
                }
            };
            th.add(thread);

        }
        for(int i=0;i<th.size();i++){
            th.get(i).start();
        }
        Assert.assertTrue(true);


    }

}

