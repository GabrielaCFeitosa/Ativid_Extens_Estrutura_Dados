import java.util.List;

public class ConsultaPreco {

    public Preco menorPreco(List<Preco> precos) {

        Preco menor = precos.get(0);

        for(Preco p : precos) {

            if(p.getValor() < menor.getValor()) {
                menor = p;
            }
        }

        return menor;
    }
}
