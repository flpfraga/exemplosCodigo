package org.example.model_equals_hash_code;

import java.util.Objects;

public class Produto {
    private String nome;
    private String codigo;
    private String peso;
    private String marca;
    private Double preco;

    public Produto(String nome, String codigo, String peso, String marca, Double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.peso = peso;
        this.marca = marca;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome) && Objects.equals(codigo, produto.codigo) && Objects.equals(peso, produto.peso) && Objects.equals(marca, produto.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, codigo, peso, marca);
    }
}
