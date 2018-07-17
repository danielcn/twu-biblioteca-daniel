package livro;

import org.junit.Test;

import static org.junit.Assert.*;

public class LivroTest {

    @Test
    public void testAny(){
        Livro livro = new Livro();
        assertTrue(livro.getLivro());
    }
}