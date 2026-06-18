import java.util.List;

public class ProdutoRepository {

    private List<Produto> produtos;

    public ProdutoRepository() {
        produtos = GeradorDados.gerarProdutos(20);
    }

    public List<Produto> listarTodos() {
        return produtos;
    }

    public void salvar(Produto produto) {
        produtos.add(produto);
    }
}
