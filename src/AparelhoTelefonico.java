/**
 * Interface para funcionalidades de telefonia
 */
public interface AparelhoTelefonico {
    /**
     * Realiza uma chamada para o número especificado
     * @param numero Número de telefone para o qual ligar
     */
    void ligar(String numero);
    
    /**
     * Atende uma chamada recebida
     */
    void atender();
    
    /**
     * Inicia o correio de voz
     */
    void iniciarCorreioVoz();
}