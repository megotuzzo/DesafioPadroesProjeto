public class LogBzzDecorator extends LogDecorator {

    public LogBzzDecorator(ILog log) {
        super(log);
    }

    @Override
    public void log(String mensagem) {
        super.log("Bzz... " + mensagem);
    }
}
