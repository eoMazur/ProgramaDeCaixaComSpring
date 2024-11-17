package com.pacientes.programadecaixacomspring.service;

import com.pacientes.programadecaixacomspring.entities.Carrinho;
import com.pacientes.programadecaixacomspring.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoService {


    private final CarrinhoRepository repository;

    @Autowired
    public CarrinhoService(CarrinhoRepository repository) {
        this.repository = repository;
    }

    public Carrinho abrirCarrinho(Carrinho carrinho){
        return repository.save(carrinho);
    }

    public List<Carrinho> buscarTodos() {
        return repository.findAll();
    }
}
