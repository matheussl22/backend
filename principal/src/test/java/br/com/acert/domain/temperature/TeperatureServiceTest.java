package br.com.acert.domain.temperature;

import br.com.acert.PrincipalServer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PrincipalServer.class)
@WebAppConfiguration
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class TeperatureServiceTest {

    @Autowired
    private TemperatureService temperatureService;

    @Test
    public void testSaveConvertCelsiusToFahrenheit() {
        temperatureService.convertCelsiusToFahrenheit(15.0);
        Page<Temperature> temperatures = temperatureService.listarPagina(PageRequest.of(0, 50));
        Temperature temperature = temperatures.stream().filter(i -> i.getValor() < 49).findFirst().get();
        Assert.assertEquals((Double) 15.0, temperature.getValor());
    }

    @Test
    public void testSaveConvertFahrenheitToCelsius() {
        temperatureService.convertCelsiusToFahrenheit(50.0);
        Page<Temperature> temperatures = temperatureService.listarPagina(PageRequest.of(0, 50));
        Temperature temperature = temperatures.stream().filter(i -> i.getValor() > 49).findFirst().get();
        Assert.assertEquals((Double) 50.0, temperature.getValor());
    }

}
