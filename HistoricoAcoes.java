import java.util.Stack;

public class HistoricoAcoes {

    private Stack<String> pilha =
        new Stack<>();

    public void registrar(String acao) {
        pilha.push(acao);
    }

    public String desfazer() {

        if(pilha.isEmpty())
            return "Sem ações";

        return pilha.pop();
    }
}
