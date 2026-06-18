import java.util.LinkedList;
import java.util.Queue;

public class FilaValidacao {

    private Queue<Preco> fila =
        new LinkedList<>();

    public void adicionar(Preco preco) {
        fila.offer(preco);
    }

    public Preco validarProximo() {
        return fila.poll();
    }
}
