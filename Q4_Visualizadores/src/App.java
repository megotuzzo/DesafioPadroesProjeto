import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        FonteDeDados valores = new FonteDeDados(Arrays.asList(10, 20, 30, 40));

        MediaObserver mediaObserver = new MediaObserver();
        SomatorioObserver somatorioObserver = new SomatorioObserver();

        valores.registraObservador(mediaObserver); //deu erro
        valores.registraObservador(somatorioObserver);

        valores.insereValor(50); 
    }
}
