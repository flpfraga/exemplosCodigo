import org.example.model_equals_hash_code.Pedido;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PedidoTest {

    Pedido compraOnline1 = new Pedido("1", PessoaTest.pessoa1, List.of(ProdutoTest.cafe));
    Pedido compraOnline2 = compraOnline1;
    Pedido compraPresencial1 = new Pedido("2", PessoaTest.pessoa2, List.of(ProdutoTest.cafe, ProdutoTest.leite1));
    Pedido compraPresencial2 = new Pedido("2", PessoaTest.pessoa2, List.of(ProdutoTest.cafe, ProdutoTest.leite1));

    @Test
    void testEqualsPedido(){
        assertNotEquals(this.compraOnline1, compraPresencial1);
        assertNotEquals(compraPresencial1, compraPresencial2);
        assertEquals(compraOnline1, compraOnline2);
    }

    @Test
    void testHashPedido(){
        List<Pedido> listPedidos = List.of(compraOnline1, compraPresencial1, compraPresencial2);
        Set<Pedido> setPedidos = new HashSet<>();

        setPedidos.add(compraOnline1);
        setPedidos.add(compraPresencial1);
        setPedidos.add(compraPresencial2);
        setPedidos.add(compraOnline2);

        assertEquals(3,listPedidos.size());
        assertEquals(3,setPedidos.size());
    }
}
