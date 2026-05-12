public class Jogador {

    public boolean entrarNoJogo() {
        return JogoFacade.verificarAcesso(this);
    }
}