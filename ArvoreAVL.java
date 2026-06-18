public class ArvoreAVL {

    private NoAVL raiz;

    public void inserir(Produto produto) {
        raiz = inserirRec(raiz, produto);
    }

    private NoAVL inserirRec(NoAVL no,
                             Produto produto) {

        if(no == null)
            return new NoAVL(produto);

        if(produto.getNome()
            .compareTo(no.produto.getNome()) < 0) {

            no.esquerda =
                inserirRec(no.esquerda, produto);

        } else {

            no.direita =
                inserirRec(no.direita, produto);
        }

        return no;
    }
}
