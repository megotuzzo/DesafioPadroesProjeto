import java.util.ArrayList;
import java.util.List;

public class FonteDeDados {
    private List<Integer> valores;
    private List<Observer> observadores;

    public FonteDeDados(List<Integer> valoresIniciais) {
        this.valores = valoresIniciais != null ? valoresIniciais : new ArrayList<>();
        this.observadores = new ArrayList<>();
    }

    public void registraObservador(Observer observador) {
        this.observadores.add(observador);
        notificaObservadores();
    }

    public void insereValor(int valor) {
        if (valor < 0) throw new IllegalArgumentException("Valor inválido");
        this.valores.add(valor);
        notificaObservadores();
    }

    private void notificaObservadores() {
        for (Observer observador : observadores) {
            observador.notificar(new ArrayList<>(valores));
        }
    }
}
