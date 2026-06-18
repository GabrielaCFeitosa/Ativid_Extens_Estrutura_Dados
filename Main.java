import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ProdutoRepository produtoRepo = new ProdutoRepository();

        MercadoRepository mercadoRepo = new MercadoRepository();

        PrecoRepository precoRepo = new PrecoRepository(produtoRepo.listarTodos(),mercadoRepo.listarTodos());

        List<Produto> produtos = produtoRepo.listarTodos();

        List<Mercado> mercados = mercadoRepo.listarTodos();

        List<Preco> precos = precoRepo.listarTodos();

        Produto produto1 = produtos.get(0);
        Produto produto2 = produtos.get(1);

        System.out.println("\n TESTE TABELA HASH");

        CatalogoProdutos catalogo = new CatalogoProdutos();

        for (Produto produto : produtos) {
            catalogo.adicionarProduto(produto);
        }

        System.out.println(catalogo.buscar(produto1.getCodigoBarras()).getNome());
                        

        System.out.println("\n TESTE LISTA DUPLAMENTE LIGADA");

        ListaCompras lista = new ListaCompras();

        lista.adicionar(produto1, 2);
        lista.adicionar(produto2, 3);

        lista.exibir();
        

        System.out.println("\n TESTE FILA ");

        FilaValidacao fila = new FilaValidacao();

        fila.adicionar(precos.get(0));

        System.out.println(fila.validarProximo());
                

        System.out.println("\n TESTE PILHA ");

        HistoricoAcoes historico = new HistoricoAcoes();

        historico.registrar("Produto cadastrado");

        System.out.println(historico.desfazer());


        System.out.println("\n TESTE ÁRVORE AVL ");

        ArvoreAVL arvore = new ArvoreAVL();

        arvore.inserir(produto1);
        arvore.inserir(produto2);

        System.out.println("2 produtos indexados na árvore AVL.");


        System.out.println("\n TESTE CONSULTA DE MENOR PREÇO ");

        ConsultaPreco consulta = new ConsultaPreco();

        Preco menor = consulta.menorPreco(precos);

        System.out.println("Menor preço encontrado: R$ " + menor.getValor());
    
    System.out.println("Menor preço encontrado: R$ " + menor.getValor());

Scanner sc = new Scanner(System.in);

int opcao;

do {

    System.out.println("\n=== PREÇO JUSTO ===");
    System.out.println("1 - Cadastrar Produto");
    System.out.println("2 - Listar Produtos");
    System.out.println("0 - Sair");

    opcao = sc.nextInt();
    sc.nextLine();

    switch (opcao) {

        case 1:

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            Produto produto = new Produto(
                    produtoRepo.listarTodos().size() + 1,
                    "COD" + System.currentTimeMillis(),
                    nome,
                    "Marca Informada",
                    "1 unidade"
            );

            produtoRepo.salvar(produto);

            System.out.println("Produto cadastrado!");
            break;

        case 2:

            for (Produto p : produtoRepo.listarTodos()) {
                System.out.println(p);
            }

            break;

        case 0:

            System.out.println("Encerrando sistema...");
            break;

        default:

            System.out.println("Opção inválida.");
    }

} while (opcao != 0);

sc.close();
    }
}
