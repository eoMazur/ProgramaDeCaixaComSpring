package com.pacientes.programadecaixacomspring.repository;

import com.pacientes.programadecaixacomspring.entities.CarrinhoProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoProdutoRepository extends JpaRepository<CarrinhoProduto, Long> {
}
