package org.example.design_patter;

import org.example.model_equals_hash_code.Produto;

/**
 * A interface {@code TotalPedidoService} define um contrato para o cálculo do valor total de um pedido
 * com base no produto e na quantidade adquirida.
 * <p>
 * Implementações dessa interface podem utilizar diferentes estratégias para calcular o total do pedido,
 * permitindo flexibilidade na escolha da lógica de precificação.
 * </p>
 *
 * <p><b>Exemplo de Uso:</b></p>
 * <pre>
 *     TotalPedidoService servico = new TotalPedidoAdapter(new SomaPedidoServiceImpl());
 *     Double total = servico.totalPedido(produto, 3);
 * </pre>
 *
 * @author Felipe Carlos Fraga
 */
public interface TotalPedidoService {

    /**
     * Calcula o valor total do pedido com base no produto e na quantidade adquirida.
     *
     * @param produto   O produto cujo total será calculado.
     * @param quantidade A quantidade do produto adquirida.
     * @return O valor total do pedido considerando a quantidade e o preço unitário do produto.
     */
    Double totalPedido(Produto produto, Integer quantidade);
}
