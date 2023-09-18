import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LojaTest {

    @Test
    public void verificarJUnit(){
        Loja loja = new Loja();
        loja.addProduto(new Produto("Arroz"));
        loja.addProduto(new Produto("Feijão"));
        loja.addProduto(new Produto("Macarrão"));

        assertEquals(loja.getProdutos().size(),3 );
    }
    @Test
    public void checkNotEquals(){
        Loja loja = new Loja();
        loja.addProduto(new Produto("Arroz"));
        loja.addProduto(new Produto("Feijão"));
        loja.addProduto(new Produto("Macarrão"));

        for(Produto produto : loja.getProdutos()){
            System.out.println(produto);
            Assertions.assertEquals(produto, "Feijão");
        }
    }
}
