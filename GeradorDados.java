import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeradorDados {

    private static final Random random = new Random();

    private static final String[] NOMES_PRODUTOS = {
            "Arroz", "Feijao", "Leite", "Cafe",
            "Macarrao", "Acucar", "Oleo",
            "Farinha", "Biscoito", "Refrigerante"
    };

    private static final String[] MARCAS = {
            "Camil", "Kicaldo", "Piracanjuba",
            "Renata", "Yoki", "Qualita"
    };

    private static final String[] MERCADOS = {
            "Atacadao",
            "Carrefour",
            "Assai",
            "Extra",
            "Sonda"
    };

    public static List<Produto> gerarProdutos(int quantidade) {

        List<Produto> produtos = new ArrayList<>();

        for (int i = 1; i <= quantidade; i++) {

            produtos.add(
                    new Produto(
                            i,
                            String.valueOf(
                                    100000 + random.nextInt(900000)),
                            NOMES_PRODUTOS[random.nextInt(NOMES_PRODUTOS.length)],
                            MARCAS[random.nextInt(MARCAS.length)],
                            "1 unidade"
                    )
            );
        }

        return produtos;
    }

    public static List<Mercado> gerarMercados() {

        List<Mercado> mercados = new ArrayList<>();

        for (int i = 0; i < MERCADOS.length; i++) {

            mercados.add(
                    new Mercado(
                            i + 1,
                            MERCADOS[i],
                            "Centro"
                    )
            );
        }

        return mercados;
    }

    public static List<Preco> gerarPrecos(
            List<Produto> produtos,
            List<Mercado> mercados,
            int quantidade) {

        List<Preco> precos = new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {

            Produto produto =
                    produtos.get(
                            random.nextInt(produtos.size()));

            Mercado mercado =
                    mercados.get(
                            random.nextInt(mercados.size()));

            double valor =
                    5 + (150 - 5) * random.nextDouble();

            precos.add(
                    new Preco(
                            produto,
                            mercado,
                            Math.round(valor * 100.0) / 100.0
                    )
            );
        }

        return precos;
    }
}
