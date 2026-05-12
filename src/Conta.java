public class Conta extends Setor {

    private static Conta instancia = new Conta();

    private Conta() {}

    public static Conta getInstancia() {
        return instancia;
    }
}