public class NoAVL {

    Produto produto;

    NoAVL esquerda;
    NoAVL direita;

    int altura;

    public NoAVL(Produto produto) {
        this.produto = produto;
        altura = 1;
    }
}
