package io.hiulesson.clientes.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 130)
    private String nome;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(name = "data_Cadastro")
    private LocalDate dataCadastro;


    @PrePersist
    public void prePersist(){
        setDataCadastro(LocalDate.now());
    }

}