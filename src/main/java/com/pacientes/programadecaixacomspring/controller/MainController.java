package com.pacientes.programadecaixacomspring.controller;

import com.pacientes.programadecaixacomspring.windows.AbrirInterface;
import javafx.scene.input.MouseEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class MainController {

    private final AbrirInterface abrirInterface;

    @Autowired
    public MainController(AbrirInterface abrirInterface) {
        this.abrirInterface = abrirInterface;
    }


    public void OnButtonCaixaClick(MouseEvent mouseEvent) throws IOException {
        abrirInterface.abrirNovaInterface("/Caixa.fxml", "Caixa");
    }

    public void OnButtonPrecoClick(MouseEvent mouseEvent) {
        abrirInterface.abrirNovaInterface("/VerificadorPreco.fxml", "Verificador de Preço");
    }

    public void OnButtonCadastroClick(MouseEvent mouseEvent) throws IOException {
        abrirInterface.abrirNovaInterface("/Cadastro.fxml", "Cadastro de Produtos");
    }

    public void OnButtonRegistrosClick(MouseEvent mouseEvent) {
        abrirInterface.abrirNovaInterface("/Registros.fxml", "Registros de Compras");
    }

    public void OnButtonSobreClick(MouseEvent mouseEvent) {
        abrirInterface.abrirNovaInterface("/Sobre.fxml", "Sobre");
    }

    public void OnButtonSairClick(MouseEvent mouseEvent) {
        System.exit(0);
    }



}
