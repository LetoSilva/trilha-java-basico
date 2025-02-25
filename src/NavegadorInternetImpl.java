import java.util.ArrayList;
import java.util.List;

/**
 * Implementação das funcionalidades de navegação na internet
 */
public class NavegadorInternetImpl implements NavegadorInternet {
    private String urlAtual;
    private List<String> historico;
    
    public NavegadorInternetImpl() {
        this.urlAtual = "";
        this.historico = new ArrayList<>();
    }
    
    @Override
    public void exibirPagina(String url) {
        this.urlAtual = url;
        this.historico.add(url);
        System.out.println("Exibindo página: " + this.urlAtual);
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }
    
    @Override
    public void atualizarPagina() {
        if (urlAtual.isEmpty()) {
            System.out.println("Nenhuma página para atualizar");
            return;
        }
        
        System.out.println("Atualizando página: " + this.urlAtual);
    }
}