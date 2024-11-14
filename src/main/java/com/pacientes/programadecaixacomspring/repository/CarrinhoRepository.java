package com.pacientes.programadecaixacomspring.repository;

import com.pacientes.programadecaixacomspring.entities.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {
}
