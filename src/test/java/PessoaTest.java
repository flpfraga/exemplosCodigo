import org.example.model_equals_hash_code.Pessoa;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PessoaTest {

    public static  Pessoa pessoa1 = new Pessoa(
            "Irineu", "12341234", "33", "123456"
    );

    public static  Pessoa pessoa2 = new Pessoa(
            "Dalva", "9090", "24", "9876543"
    );

    public static  Pessoa pessoa3 = new Pessoa(
            "Dalva", "9090", "24", "9876543"
    );

    @Test
    void testEqualsPessoa(){
        assertNotEquals(pessoa1, pessoa2);
        assertEquals(pessoa2, pessoa3);
    }

    @Test
    void testEqualsHashPessoa(){
        List<Pessoa> listPessoas = List.of(pessoa1, pessoa2, pessoa3);
        Set<Pessoa> setPessoas = new HashSet<>();
        setPessoas.add(pessoa1);
        setPessoas.add(pessoa2);
        setPessoas.add(pessoa3);

        assertEquals(3, listPessoas.size());
        assertEquals(3, setPessoas.size());
    }
}
