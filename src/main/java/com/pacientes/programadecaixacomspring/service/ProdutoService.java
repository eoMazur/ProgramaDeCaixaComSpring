package com.pacientes.programadecaixacomspring.service;

import com.pacientes.programadecaixacomspring.entities.Produto;
import com.pacientes.programadecaixacomspring.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto cadastrarProduto(Produto produto){
        return repository.save(produto);
    }

    public String buscarPeloId(Long id){
        if (!repository.existsById(id)){
            return "produto não existe";
        }

        return repository.findById(id).get().getNome();
    }

}
