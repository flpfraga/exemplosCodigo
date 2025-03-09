package org.example.design_patter;

import org.example.model_equals_hash_code.Produto;

/**
 * A classe {@code TotalPedidoAdapter} atua como um adaptador entre a interface {@link TotalPedidoService}
 * e a implementação concreta de {@link SomaPedidoService}, permitindo a reutilização da lógica de cálculo
 * sem acoplamento direto à implementação externa.
 * <p>
 * Esse padrão de design permite maior flexibilidade e facilita futuras substituições da implementação
 * do serviço de cálculo do total do pedido.
 * </p>
 *
 * <p><b>Exemplo de Uso:</b></p>
 * <pre>
 *     SomaPedidoService servicoExterno = new SomaPedidoServiceImpl();
 *     TotalPedidoService adapter = new TotalPedidoAdapter(servicoExterno);
 *     Double total = adapter.totalPedido(produto, 5);
 * </pre>
 *
 * @author Felipe Carlos Fraga
 */
public class TotalPedidoAdapter implements TotalPedidoService {

    private final SomaPedidoService servicoExterno;

    /**
     * Construtor da classe {@code TotalPedidoAdapter}.
     *
     * @param servicoExterno Instância de {@link SomaPedidoService} que será utilizada para cálculo do total do pedido.
     */
    public TotalPedidoAdapter(SomaPedidoService servicoExterno) {
        this.servicoExterno = servicoExterno;
    }

    /**
     * Calcula o valor total do pedido multiplicando a quantidade do produto pelo seu preço unitário.
     *
     * @param produto   O produto cujo total será calculado.
     * @param quantidade A quantidade do produto adquirida.
     * @return O valor total do pedido com base na quantidade e no preço unitário do produto.
     */
    @Override
    public Double totalPedido(Produto produto, Integer quantidade) {
        return servicoExterno.calcularTotal(quantidade, produto.getPreco());
    }
}
