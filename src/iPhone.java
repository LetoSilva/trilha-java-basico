/**
 * Classe principal que representa o iPhone
 */
public class iPhone {
    private ReprodutorMusicalImpl reprodutorMusical;
    private AparelhoTelefonicoImpl aparelhoTelefonico;
    private NavegadorInternetImpl navegadorInternet;
    
    /**
     * Construtor que inicializa os componentes do iPhone
     */
    public iPhone() {
        this.reprodutorMusical = new ReprodutorMusicalImpl();
        this.aparelhoTelefonico = new AparelhoTelefonicoImpl();
        this.navegadorInternet = new NavegadorInternetImpl();
    }
    
    /**
     * Liga o dispositivo
     */
    public void ligar() {
        System.out.println("iPhone ligado");
    }
    
    /**
     * Desliga o dispositivo
     */
    public void desligar() {
        System.out.println("iPhone desligado");
    }
    
    /**
     * Reinicia o dispositivo
     */
    public void reiniciar() {
        System.out.println("iPhone reiniciando");
    }
    
    /**
     * Obtém o reprodutor musical
     * @return O reprodutor musical implementado
     */
    public ReprodutorMusical getReprodutorMusical() {
        return this.reprodutorMusical;
    }
    
    /**
     * Obtém o aparelho telefônico
     * @return O aparelho telefônico implementado
     */
    public AparelhoTelefonico getAparelhoTelefonico() {
        return this.aparelhoTelefonico;
    }
    
    /**
     * Obtém o navegador de internet
     * @return O navegador de internet implementado
     */
    public NavegadorInternet getNavegadorInternet() {
        return this.navegadorInternet;
    }
}