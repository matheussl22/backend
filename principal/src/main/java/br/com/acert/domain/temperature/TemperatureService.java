package br.com.acert.domain.temperature;

import br.com.core.support.service.BaseService;

public interface TemperatureService extends BaseService<Temperature, Long> {

    Double convertCelsiusToFahrenheit(Double valor);

    Double convertFahrenheitToCelsius(Double valor);

}
