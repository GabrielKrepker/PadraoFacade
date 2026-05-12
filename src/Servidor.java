public class Servidor extends Setor {

    private static Servidor instancia = new Servidor();

    private Servidor() {}

    public static Servidor getInstancia() {
        return instancia;
    }
}