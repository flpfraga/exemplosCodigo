import org.example.model_equals_hash_code.Produto;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProdutoTest {
    public static Produto cafe = new Produto(
            "Café", "a1b2", "500", "Dubom", 80.00
    );
    public static Produto leite1 = new Produto(
            "Leite", "a1b3", "1000", "Vaquinha", 30.00
    );
    public static Produto leite2 = new Produto(
            "Leite", "a1b3", "1000", "Vaquinha", 30.00
    );



    @Test
    void testEqualsProdutos(){
        assertNotEquals(cafe, leite1);
        assertEquals(leite1, leite2);
    }

    @Test
    void testEqualsHashProdutos(){
        List<Produto> listProdutos = List.of(cafe, leite1, leite2);
        Set<Produto> setProdutos  = new HashSet<>();
        setProdutos.add(cafe);
        setProdutos.add(leite1);
        setProdutos.add(leite2);

        assertEquals(3, listProdutos.size());
        assertEquals(2, setProdutos.size());
    }

}
