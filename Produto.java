public class Produto {

    private int id;
    private String codigoBarras;
    private String nome;
    private String marca;
    private String unidadeMedida;

    public Produto(int id, String codigoBarras, String nome,
                   String marca, String unidadeMedida) {

        this.id = id;
        this.codigoBarras = codigoBarras;
        this.nome = nome;
        this.marca = marca;
        this.unidadeMedida = unidadeMedida;
    }

    public int getId() {
        return id;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public String getNome() {
        return nome;
    }
}
