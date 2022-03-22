package com.vemser.PrimeiroProjetoSpring.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class ContatoCreateDTO {

    private Integer idPessoa;

    private Integer tipo;

    private String numero;

    private String descricao;
}
