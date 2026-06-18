public class ItemLista {

    Produto produto;
    int quantidade;

    ItemLista anterior;
    ItemLista proximo;

    public ItemLista(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
