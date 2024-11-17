package com.pacientes.programadecaixacomspring.service;

import com.pacientes.programadecaixacomspring.entities.CarrinhoProduto;
import com.pacientes.programadecaixacomspring.repository.CarrinhoProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<CarrinhoProduto> buscarTodos(){
        return repository.findAll();
    }
}
