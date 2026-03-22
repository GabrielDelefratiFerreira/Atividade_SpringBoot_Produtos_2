package com.example.produtos.Controller;

import com.example.produtos.Model.ProdutoModel;
import com.example.produtos.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> findAll(){
        return produtoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ProdutoModel> buscarPorId(@PathVariable Long id){
        return produtoService.buscarPorId(id);
    }

    @PostMapping
    public ProdutoModel criarProduto(@RequestBody ProdutoModel produto){
        return produtoService.criarProduto(produto);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable long id){
        produtoService.deletarProduto(id);
    }
}