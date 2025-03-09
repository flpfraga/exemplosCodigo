package org.example.design_patter;

/**
 * A classe {@code SomaPedidoService} realiza o cálculo do valor total de um pedido
 * considerando a cotação do dólar.
 * <p>
 * Essa implementação permite a conversão de preços definidos em dólar para a moeda local,
 * garantindo que o valor final do pedido seja corretamente calculado com base na taxa de câmbio.
 * </p>
 *
 * <p><b>Exemplo de Uso:</b></p>
 * <pre>
 *     SomaPedidoService servico = new SomaPedidoService(5.10);
 *     Double total = servico.calcularTotal(2, 20.0); // Retorna 204.0
 * </pre>
 *
 * @author Felipe Carlos Fraga
 */
public class SomaPedidoService {

    private final Double cotacaoDolar;

    /**
     * Construtor da classe {@code SomaPedidoService}.
     *
     * @param cotacaoDolar A cotação do dólar no momento da conversão.
     */
    public SomaPedidoService(Double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    /**
     * Calcula o valor total do pedido multiplicando a quantidade pelo preço unitário
     * do produto em dólar e pela cotação atual do dólar.
     *
     * @param quantidade   A quantidade do produto adquirida.
     * @param precoEmDolar O preço unitário do produto em dólar.
     * @return O valor total do pedido convertido para a moeda local.
     */
    public Double calcularTotal(Integer quantidade, Double precoEmDolar){
        return quantidade * precoEmDolar * cotacaoDolar;
    }
}