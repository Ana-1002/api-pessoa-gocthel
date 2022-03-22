package com.vemser.PrimeiroProjetoSpring.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class EnderecoCreateDTO {
    private Integer tipo;
    private String cep;
    private String complemento;
    private Integer numero;

    private String logradouro;

    private String cidade;

    private String estado;

    private String pais;

}
