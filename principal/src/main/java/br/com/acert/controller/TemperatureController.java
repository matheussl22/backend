package br.com.acert.controller;

import br.com.acert.domain.temperature.Temperature;
import br.com.acert.domain.temperature.TemperatureService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/temperatures")
@Api(value = "Temperatures")
public class TemperatureController {

    @Autowired
    private TemperatureService temperatureService;

    @ApiOperation(value = "Make a conversion of from celsius to fahrenheit")
    @GetMapping(value = "/celsius-to-fahrenheit/{valor}")
    public Double convertCelsiusToFahrenheit(@PathVariable Double valor) {
        return temperatureService.convertCelsiusToFahrenheit(valor);
    }

    @ApiOperation(value = "Make a conversion of from fahrenheit to celsius")
    @GetMapping(value = "/fahrenheit-to-celsius/{valor}")
    public Double fahrenheitToCelsius(@PathVariable Double valor) {
        return temperatureService.convertFahrenheitToCelsius(valor);
    }

    @GetMapping
    @ApiOperation(value = "Search all conversions performed")
    public Page<Temperature> listarTemperatures(@PageableDefault(page = 0, size = 50) Pageable pageable) {
        return temperatureService.listarPagina(pageable);
    }

}
