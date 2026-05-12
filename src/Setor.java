import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Jogador> jogadoresBloqueados = new ArrayList<>();

    public void addJogadorBloqueado(Jogador jogador) {
        this.jogadoresBloqueados.add(jogador);
    }

    public boolean verificarJogadorBloqueado(Jogador jogador) {
        return this.jogadoresBloqueados.contains(jogador);
    }
}