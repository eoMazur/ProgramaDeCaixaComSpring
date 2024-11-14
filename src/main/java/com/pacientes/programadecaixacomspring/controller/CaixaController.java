package com.pacientes.programadecaixacomspring.controller;

import com.pacientes.programadecaixacomspring.service.ProdutoService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CaixaController {


    @FXML
    public TextField tf_codigo;

    @FXML
    public TextField tf_quantidade;

    @FXML
    public Label lbl_produto;

    @Autowired
    private ProdutoService service;

    public void OnKeyTypedCodigo(KeyEvent keyEvent) {
        Long id = Long.valueOf(tf_codigo.getCharacters().toString());
        String nome = service.buscarPeloId(id);

        lbl_produto.setText(nome);

    }
}
