package com.example.produtos.Service;

import com.example.produtos.Model.ProdutoModel;
import com.example.produtos.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll(){
        return produtoRepository.findAll();
    }

    public Optional<ProdutoModel> buscarPorId(Long id){
        return produtoRepository.findById(id);
    }

    public ProdutoModel criarProduto(ProdutoModel produto){
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id){
        produtoRepository.deleteById(id);
    }
}