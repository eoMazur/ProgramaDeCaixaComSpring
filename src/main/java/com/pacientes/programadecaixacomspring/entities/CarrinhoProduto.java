package com.pacientes.programadecaixacomspring.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarrinhoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Carrinho carrinho;

    @OneToOne
    private Produto produto;

    private Integer quantidade;

    @Override
    public String toString(){
        return "Produto: " + produto.getNome()
                + " | Preço: " + produto.getPreco()
                + " | Quantidade: " + quantidade
                + " | Preço Total: " + produto.getPreco() * quantidade;
    }
}
