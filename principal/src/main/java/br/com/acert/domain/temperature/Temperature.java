package br.com.acert.domain.temperature;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Temperature {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Double valor;

    @Column
    private LocalDateTime createDate = LocalDateTime.now();

    private Temperature(Double valor) {
        this.valor = valor;
    }

    public static Temperature of(Double valor) {
        return new Temperature(valor);
    }

    public Double celsiusToFahrenheit() {
        return (1.8 * this.valor) + 32.00;
    }

    public Double fahrenheitToCelsius() {
        return ((this.valor - 32) / 1.8000);
    }

}
