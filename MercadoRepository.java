import java.util.List;

public class MercadoRepository {

    private List<Mercado> mercados;

    public MercadoRepository() {
        mercados = GeradorDados.gerarMercados();
    }

    public List<Mercado> listarTodos() {
        return mercados;
    }
}
