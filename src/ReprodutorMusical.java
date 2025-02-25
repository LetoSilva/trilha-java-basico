/**
 * Interface para funcionalidades de reprodução musical
 */
public interface ReprodutorMusical {
    /**
     * Inicia a reprodução da música atual
     */
    void tocar();
    
    /**
     * Pausa a reprodução da música atual
     */
    void pausar();
    
    /**
     * Seleciona uma música para reprodução
     * @param musica Nome da música a ser selecionada
     */
    void selecionarMusica(String musica);
}