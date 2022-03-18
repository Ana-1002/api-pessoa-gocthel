package com.vemser.PrimeiroProjetoSpring.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class EnderecoCreateDTO {
    @NotEmpty    @ApiModelProperty(value="Tipo")
    private String tipo;
    @NotEmpty @Size(min = 0, max = 8)
    @ApiModelProperty(value="Cep")
    private String cep;
    @NotBlank @ApiModelProperty(value="Numero da casa")
    private String numeroCasa;
    @NotEmpty @Size(max = 250) @ApiModelProperty(value="Logradouro")
    private String logradouro;
    @NotEmpty @Size(max = 250) @ApiModelProperty(value="Cidade")
    private String cidade;
    @NotEmpty @ApiModelProperty(value="Estado")
    private String estado;
    @NotEmpty @ApiModelProperty(value="Pais")
    private String pais;
}
