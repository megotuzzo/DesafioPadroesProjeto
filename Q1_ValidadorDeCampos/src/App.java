public class App {
    public static void main(String[] args) {
        String email = "bernardo.copsteinpucrs.br";
        Validador validador = new Validador();

        if (validador.valida(Tipo.EMAIL, email)) {
            System.out.println(email + " é um email válido!");
        } else {
            System.out.println(email + " não é um email válido!");
        }
    }
}
