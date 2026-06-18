public class Mercado {

    private int id;
    private String nome;
    private String bairro;

    public Mercado(int id, String nome, String bairro) {
        this.id = id;
        this.nome = nome;
        this.bairro = bairro;
    }

    public String getNome() {
        return nome;
    }
}
