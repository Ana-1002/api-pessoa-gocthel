package com.vemser.PrimeiroProjetoSpring.entity;

import lombok.*;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity (name="Contato")
public class ContatoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ENDERECO_SEQ")
    @SequenceGenerator(name= "ENDERECO_SEQ", sequenceName = "seq_endereco", allocationSize = 1)
    @Column(name = "id_contato")
    private Integer idContato;
    @Column(name = "tipo")
    private Integer tipo;
    @Column(name = "numero")
    private String numero;
    @Column(name = "descricao")
    private String descricao;
}
