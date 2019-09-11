package br.com.acert.domain.temperature;

import br.com.core.support.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class TemperatureServiceImpl extends AbstractService<Temperature, Long, TemperatureRepository>
        implements TemperatureService {

    @Override
    public Double convertCelsiusToFahrenheit(Double valor) {
        Temperature temperature = Temperature.of(valor);
        salvar(temperature);
        return temperature.celsiusToFahrenheit();
    }

    @Override
    public Double convertFahrenheitToCelsius(Double valor) {
        Temperature temperature = Temperature.of(valor);
        salvar(temperature);
        return temperature.fahrenheitToCelsius();
    }

}

