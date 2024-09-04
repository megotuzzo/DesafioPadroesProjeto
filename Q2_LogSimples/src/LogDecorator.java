public abstract class LogDecorator implements ILog {
    protected ILog log;

    public LogDecorator(ILog log) {
        this.log = log;
    }

    @Override
    public void log(String mensagem) {
        log.log(mensagem);
    }
}
