package com.pacientes.programadecaixacomspring.service;

import com.pacientes.programadecaixacomspring.entities.Produto;
import com.pacientes.programadecaixacomspring.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto cadastrarProduto(Produto produto){
        return repository.save(produto);
    }

    public Optional<Produto> buscarPeloId(Long id){

        return repository.findById(id);
    }

}
