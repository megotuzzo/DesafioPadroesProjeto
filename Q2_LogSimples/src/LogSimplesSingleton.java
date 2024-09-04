import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LogSimplesSingleton implements Iterable<String> {
    private static LogSimplesSingleton instance;
    private List<String> mensagens;

    private LogSimplesSingleton() {
        mensagens = new LinkedList<>();
    }

    public static LogSimplesSingleton getInstance() {
        if (instance == null) {
            instance = new LogSimplesSingleton();
        }
        return instance;
    }

    public void log(String m) {
        String logM = LocalDate.now().toString() + " : " + m;
        mensagens.add(logM);
    }

    @Override
    public Iterator<String> iterator() {
        return mensagens.iterator();
    }
}
