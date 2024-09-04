import java.util.HashMap;
import java.util.Map;

public class Validador{
    private Map<Tipo, ValidadorStrategy> strategies;

    public Validador() {
        strategies = new HashMap<>();
        strategies.put(Tipo.EMAIL, new ValidaEmail());
        strategies.put(Tipo.INTEIRO, new ValidaInteiro());
        strategies.put(Tipo.MATRICULA, new ValidaMatricula());
    }

    public boolean valida(Tipo tipo, String valor) {
        ValidadorStrategy strategy = strategies.get(tipo);
        if (strategy != null) {
            return strategy.valida(valor);
        }
        return false; 
    }
}
