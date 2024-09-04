public class LogErroDecorator extends LogDecorator {

    public LogErroDecorator(ILog log) {
        super(log);
    }

    @Override
    public void log(String mensagem) {
        super.log("ERRO - " + mensagem);
    }
}
