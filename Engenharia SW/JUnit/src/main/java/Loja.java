import java.util.*;

public class Loja {
    private List<Produto> produtos = new LinkedList<>() {
    };
    public void addProduto(Produto produto){
        produtos.add(produto);
    }
    public List<Produto> getProdutos(){
        return produtos;
    }


}
