package org.example.model_equals_hash_code;

import java.util.List;

public class Pedido {
    private String id;
    private Pessoa pessoa;
    private List<Produto> produto;

    public Pedido(String id, Pessoa pessoa, List<Produto> produto) {
        this.id = id;
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
}
