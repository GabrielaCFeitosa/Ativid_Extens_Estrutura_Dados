import java.util.HashMap;

public class CatalogoProdutos {

    private HashMap<String, Produto> tabelaHash;

    public CatalogoProdutos() {
        tabelaHash = new HashMap<>();
    }

    public void adicionarProduto(Produto produto) {
        tabelaHash.put(produto.getCodigoBarras(), produto);
    }

    public Produto buscar(String codigoBarras) {
        return tabelaHash.get(codigoBarras);
    }
}
