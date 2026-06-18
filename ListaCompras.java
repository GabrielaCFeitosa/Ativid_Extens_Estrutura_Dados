public class ListaCompras {

    private ItemLista inicio;
    private ItemLista fim;

    public void adicionar(Produto produto, int quantidade) {

        ItemLista novo =
            new ItemLista(produto, quantidade);

        if(inicio == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public void exibir() {

        ItemLista atual = inicio;

        while(atual != null) {

            System.out.println(
                atual.produto.getNome() +
                " - " +
                atual.quantidade
            );

            atual = atual.proximo;
        }
    }
}
