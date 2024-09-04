import java.util.List;

public class SomatorioObserver implements Observer {
    @Override
    public void notificar(List<Integer> dados) {
        if (dados == null || dados.isEmpty()) {
            System.out.println("Somatorio: 0");
            return;
        }
        int soma = 0;
        for (int valor : dados) {
            soma += valor;
        }
        System.out.println("Somatorio: " + soma);
    }
}

