package com.pacientes.programadecaixacomspring.controller;

import com.pacientes.programadecaixacomspring.entities.Produto;
import com.pacientes.programadecaixacomspring.service.ProdutoService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class CadastroController {

    @FXML
    public TextField tf_nome;

    @FXML
    public TextField tf_preco;

    @FXML
    public Label lbl_produto;

    private final ProdutoService produtoService;

    public CadastroController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }


    public void OnButtonCadastrarClick(MouseEvent mouseEvent) {
        String nome = tf_nome.getCharacters().toString();

        Double preco = Double.valueOf(tf_preco.getCharacters().toString());

        Produto produto = produtoService.cadastrarProduto(new Produto(null, nome, preco));

        lbl_produto.setText(produto.toString());
    }
}
