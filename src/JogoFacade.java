public class JogoFacade {

    public static boolean verificarAcesso(Jogador jogador) {
        if (Servidor.getInstancia().verificarJogadorBloqueado(jogador)) {
            return false;
        }
        if (AntiCheat.getInstancia().verificarJogadorBloqueado(jogador)) {
            return false;
        }
        if (Conta.getInstancia().verificarJogadorBloqueado(jogador)) {
            return false;
        }
        return true;
    }
}