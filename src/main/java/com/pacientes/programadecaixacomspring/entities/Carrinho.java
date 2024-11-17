package com.pacientes.programadecaixacomspring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataCompra;

    @Override
    public String toString(){
        return "Id: " + id + " | Data da Compra: " + dataCompra.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }


}
