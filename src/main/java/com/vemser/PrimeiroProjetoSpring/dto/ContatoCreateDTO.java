package com.vemser.PrimeiroProjetoSpring.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class ContatoCreateDTO {
    @NotEmpty @NotNull @ApiModelProperty(value="Nome do Contato")
    private String nomeContato;
    @NotEmpty @NotNull @Size(max = 13)
    @ApiModelProperty(value="Número do Contato")
    private String numeroContato;
}
