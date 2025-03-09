package org.example.model_equals_hash_code;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private String id;
    private String idade;
    private String documento;

    public Pessoa(String nome, String id, String idade, String documento) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(id, pessoa.id) && Objects.equals(idade, pessoa.idade) && Objects.equals(documento, pessoa.documento);
    }

}
