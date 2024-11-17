package com.pacientes.programadecaixacomspring.controller;

import com.pacientes.programadecaixacomspring.entities.Carrinho;
import com.pacientes.programadecaixacomspring.service.CarrinhoService;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class RegistrosController {

    private final CarrinhoService service;

    @FXML
    public ListView<Carrinho> list_carrinhos;

    @Autowired
    public RegistrosController(CarrinhoService service) {
        this.service = service;
    }


    public void OnButtonBuscarClick(MouseEvent mouseEvent) {
        List<Carrinho> compras = service.buscarTodos();

        list_carrinhos.setItems(FXCollections.observableArrayList(compras));
    }
}
