import java.util.List;

public class PrecoRepository {

    private List<Preco> precos;

    public PrecoRepository(
            List<Produto> produtos,
            List<Mercado> mercados) {

        precos =
                GeradorDados.gerarPrecos(
                        produtos,
                        mercados,
                        50);
    }

    public List<Preco> listarTodos() {
        return precos;
    }
}
