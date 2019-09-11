package br.com.acert.domain.temperature;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureTest {

    @Test
    public void convertCelsiusToFahrenheit() {
        Assert.assertEquals((Double) 59.0, Temperature.of(15.0).celsiusToFahrenheit());
    }

    @Test
    public void convertFahrenheitToCelsius() {
        Assert.assertEquals((Double) 4426.666666666667, Temperature.of(8000.0).fahrenheitToCelsius());
    }

}
