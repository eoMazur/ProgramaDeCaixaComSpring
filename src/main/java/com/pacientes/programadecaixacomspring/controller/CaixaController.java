package com.pacientes.programadecaixacomspring.controller;

import com.pacientes.programadecaixacomspring.entities.Carrinho;
import com.pacientes.programadecaixacomspring.entities.Produto;
import com.pacientes.programadecaixacomspring.entities.CarrinhoProduto;
import com.pacientes.programadecaixacomspring.service.CarrinhoProdutoService;
import com.pacientes.programadecaixacomspring.service.CarrinhoService;
import com.pacientes.programadecaixacomspring.service.ProdutoService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CaixaController {


    @FXML
    public TextField tf_codigo;

    @FXML
    public TextField tf_quantidade;

    @FXML
    public Label lbl_produto;

    @FXML
    public ListView<String> listProdutos;

    @FXML
    public Label lbl_precoTotal;

    @FXML
    public TextField tf_valorPago;

    @FXML
    public Label lbl_troco;

    private final ProdutoService service;

    private final CarrinhoService carrinhoService;

    private final CarrinhoProdutoService carrinhoProdutoService;

    private final Carrinho carrinho;

    private List<CarrinhoProduto> listaCarrinhoProdutos = new ArrayList<>();

    private Double precoTotal = 0.0;

    @Autowired
    public CaixaController(ProdutoService service, CarrinhoService carrinhoService, CarrinhoProdutoService carrinhoProdutoService) {
        this.service = service;
        this.carrinhoService = carrinhoService;
        this.carrinhoProdutoService = carrinhoProdutoService;
        carrinho = new Carrinho(null, LocalDateTime.now());
    }

    public void OnKeyTypedCodigo(KeyEvent keyEvent) {
        if (!tf_codigo.getCharacters().isEmpty()){
            Long id = Long.valueOf(tf_codigo.getCharacters().toString());
            Optional<Produto> produto = service.buscarPeloId(id);

            if(produto.isEmpty()){
                lbl_produto.setText("O produto não existe!");
            }
            else{
                lbl_produto.setText("Produto: " + produto.get().getNome() + " | Preço: R$" + produto.get().getPreco());
            }
        }
    }

    public void OnButtonAdicionarClick(MouseEvent mouseEvent) {
        Long id = Long.valueOf(tf_codigo.getCharacters().toString());
        Integer quantidade;

        if(!tf_quantidade.getCharacters().isEmpty()){
            quantidade = Integer.valueOf(tf_quantidade.getCharacters().toString());
        }
        else{
            quantidade = 1;
        }



        Optional<Produto> produto = service.buscarPeloId(id);


        produto.ifPresent(prod -> {
            CarrinhoProduto carrinhoProduto = new CarrinhoProduto(null, carrinho, prod, quantidade);
            listaCarrinhoProdutos.add(carrinhoProduto);
            listProdutos.getItems().add(carrinhoProduto.toString());
        });

        for (CarrinhoProduto e : listaCarrinhoProdutos){
            precoTotal += e.getProduto().getPreco() * e.getQuantidade();
        }

        lbl_precoTotal.setText("Preço total: R$" + precoTotal);
    }

    public void OnButtonPagarClick(MouseEvent mouseEvent) {

        Double valorPago = Double.valueOf(tf_valorPago.getCharacters().toString());

        if(tf_valorPago.getCharacters().isEmpty()){
            lbl_troco.setText("Informe o valor pago!");
        }
        else{

            valorPago = valorPago - precoTotal;


            if(valorPago < 0){
                lbl_troco.setText("Está faltando: R$" + valorPago);
            }
            else{
                lbl_troco.setText("Troco: " + valorPago);

                carrinhoService.abrirCarrinho(carrinho);
                listaCarrinhoProdutos.stream().map(carrinhoProdutoService::registrarCompra);
            }
        }
    }
}
