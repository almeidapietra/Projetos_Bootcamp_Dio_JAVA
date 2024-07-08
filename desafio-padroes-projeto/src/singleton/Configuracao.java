package singleton;



import java.util.HashMap;
import java.util.Map;

public class Configuracao {
    private static Configuracao instancia;
    private Map<String, String> configuracoes;

    private Configuracao() {
        configuracoes = new HashMap<>();
    }

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public void setConfiguracao(String chave, String valor) {
        configuracoes.put(chave, valor);
    }

    public String getConfiguracao(String chave) {
        return configuracoes.get(chave);
    }
}
