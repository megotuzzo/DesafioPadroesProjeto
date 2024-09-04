public class App {
    public static void main(String[] args) {
        LogSimplesSingleton log = LogSimplesSingleton.getInstance();

        log.log("Mensagem de alerta 1");
        log.log("Mensagem de alarme 23");
        log.log("Mensagem de PANICO!!");

        ILog logBzz = new LogBzzDecorator(log);
        ILog logErro = new LogErroDecorator(log);

        logBzz.log("Mensagem de bzz");
        logErro.log("Mensagem de erro");

        for (String m : log) {
            System.out.println(m);
        }

    }
}
