package com.pacientes.programadecaixacomspring.controller;

import com.pacientes.programadecaixacomspring.entities.Produto;
import com.pacientes.programadecaixacomspring.service.ProdutoService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class VerificadorPrecoController {

    private final ProdutoService service;

    @FXML
    public TextField tf_codigo;

    @FXML
    public Label lbl_preco;

    @FXML
    public Label lbl_descricao;

    @FXML
    public Label lbl_aviso;

    @Autowired
    public VerificadorPrecoController(ProdutoService service) {
        this.service = service;
    }


    public void OnButtonBuscarClick(MouseEvent mouseEvent) {

        if(tf_codigo.getCharacters().isEmpty()){
            lbl_aviso.setText("Preencha o campo código!");
        }
        else {
            Long id = Long.valueOf(tf_codigo.getCharacters().toString());

            if (id <= 0){
                lbl_aviso.setText("Id Invalido!");
            }
            else {
                Optional<Produto> produto = service.buscarPeloId(id);

                if(produto.isEmpty()){
                    lbl_aviso.setText("Produto não encontrado!");
                }
                else {
                    lbl_descricao.setText(produto.get().getNome());

                    lbl_preco.setText("R$" + produto.get().getPreco());
                }
            }
        }
    }
}
