package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Corrida {
    private BigDecimal valor;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    //associação com Enum
    private FormaDePagamento formaDePagamento;
    private Situacao situacao = Situacao.agendada;

}
