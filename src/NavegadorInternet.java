/**
 * Interface para funcionalidades de navegação na internet
 */
public interface NavegadorInternet {
    /**
     * Exibe a página web correspondente à URL fornecida
     * @param url Endereço da página web a ser exibida
     */
    void exibirPagina(String url);
    
    /**
     * Adiciona uma nova aba ao navegador
     */
    void adicionarNovaAba();
    
    /**
     * Atualiza a página web atual
     */
    void atualizarPagina();
}