package org.example;

import org.example.model_equals_hash_code.Pedido;
import org.example.model_equals_hash_code.Pessoa;
import org.example.model_equals_hash_code.Produto;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Produto cafe = new Produto(
                "Café", "a1b2", "500", "Dubom", 80.00
        );
        Produto leite = new Produto(
                "Leite", "a1b3", "1000", "Vaquinha", 30.00
        );

        Pessoa pessoa1 = new Pessoa(
                "Irineu", "12341234", "33", "123456"
        );

        Pessoa pessoa2 = new Pessoa(
                "Dalva", "9090", "24", "9876543"
        );
        Pedido compraOnline = new Pedido("1", pessoa1, List.of(cafe));

        Pedido compraPresencial = new Pedido("2", pessoa2, List.of(cafe, leite));



        System.out.println(cafe == leite);

//        System.out.println(();

    }
}
