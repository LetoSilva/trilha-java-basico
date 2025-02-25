/**
 * Implementação das funcionalidades de telefonia
 */
public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    private String numeroAtual;
    private boolean emChamada;
    
    public AparelhoTelefonicoImpl() {
        this.numeroAtual = "";
        this.emChamada = false;
    }
    
    @Override
    public void ligar(String numero) {
        if (emChamada) {
            System.out.println("Já existe uma chamada em andamento");
            return;
        }
        
        this.numeroAtual = numero;
        this.emChamada = true;
        System.out.println("Ligando para: " + this.numeroAtual);
    }
    
    @Override
    public void atender() {
        if (emChamada) {
            System.out.println("Já existe uma chamada em andamento");
            return;
        }
        
        this.emChamada = true;
        System.out.println("Chamada atendida");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}