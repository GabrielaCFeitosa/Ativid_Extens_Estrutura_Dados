import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // PRODUTOS
        Produto arroz = new Produto(
                1,
                "123456",
                "Arroz",
                "Camil",
                "5kg");

        Produto feijao = new Produto(
                2,
                "654321",
                "Feijao",
                "Kicaldo",
                "1kg");

        // HASH
        CatalogoProdutos catalogo =
                new CatalogoProdutos();

        catalogo.adicionarProduto(arroz);
        catalogo.adicionarProduto(feijao);

        System.out.println(
                catalogo.buscar("123456")
                        .getNome());

        // LISTA DUPLAMENTE LIGADA
        ListaCompras lista =
                new ListaCompras();

        lista.adicionar(arroz, 2);
        lista.adicionar(feijao, 3);

        lista.exibir();

        // FILA
        Mercado mercado =
                new Mercado(1,
                        "Atacadao",
                        "Centro");

        Preco preco =
                new Preco(arroz,
                        mercado,
                        24.90);

        FilaValidacao fila =
                new FilaValidacao();

        fila.adicionar(preco);

        System.out.println(
                fila.validarProximo());

        // PILHA
        HistoricoAcoes historico =
                new HistoricoAcoes();

        historico.registrar(
                "Produto cadastrado");

        System.out.println(
                historico.desfazer());

        // AVL
        ArvoreAVL arvore =
                new ArvoreAVL();

        arvore.inserir(arroz);
        arvore.inserir(feijao);

        // MENOR PRECO
        List<Preco> precos =
                new ArrayList<>();

        precos.add(preco);

        ConsultaPreco consulta =
                new ConsultaPreco();

        Preco menor =
                consulta.menorPreco(precos);

        System.out.println(
                menor.getValor());
    }
}
