package com.pacientes.programadecaixacomspring.service;

import com.pacientes.programadecaixacomspring.entities.CarrinhoProduto;
import com.pacientes.programadecaixacomspring.repository.CarrinhoProdutoRepository;
import com.pacientes.programadecaixacomspring.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrinhoProdutoService {

    private final CarrinhoProdutoRepository repository;

    @Autowired
    public CarrinhoProdutoService(CarrinhoProdutoRepository repository) {
        this.repository = repository;
    }

    public CarrinhoProduto registrarCompra(CarrinhoProduto carrinhoProduto){
        return repository.save(carrinhoProduto);
    }
}
