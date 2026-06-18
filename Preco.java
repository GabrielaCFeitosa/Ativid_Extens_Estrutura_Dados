import java.time.LocalDateTime;

public class Preco {

    private Produto produto;
    private Mercado mercado;
    private double valor;
    private LocalDateTime dataColeta;

    public Preco(Produto produto,
                 Mercado mercado,
                 double valor) {

        this.produto = produto;
        this.mercado = mercado;
        this.valor = valor;
        this.dataColeta = LocalDateTime.now();
    }

    public double getValor() {
        return valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public Mercado getMercado() {
        return mercado;
    }
}
