import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JogadorTest {

    @Test
    void devePermitirEntradaSemBloqueios() {
        Jogador jogador = new Jogador();
        assertTrue(jogador.entrarNoJogo());
    }

    @Test
    void naoDevePermitirSeBloqueadoNoServidor() {
        Jogador jogador = new Jogador();
        Servidor.getInstancia().addJogadorBloqueado(jogador);

        assertFalse(jogador.entrarNoJogo());
    }

    @Test
    void naoDevePermitirSeBloqueadoNoAnticheat() {
        Jogador jogador = new Jogador();
        AntiCheat.getInstancia().addJogadorBloqueado(jogador);

        assertFalse(jogador.entrarNoJogo());
    }

    @Test
    void naoDevePermitirSeContaBanida() {
        Jogador jogador = new Jogador();
        Conta.getInstancia().addJogadorBloqueado(jogador);

        assertFalse(jogador.entrarNoJogo());
    }
}