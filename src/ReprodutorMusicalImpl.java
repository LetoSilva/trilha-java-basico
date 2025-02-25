/**
 * Implementacao das funcionalidades de reproducao musical
 */
public class ReprodutorMusicalImpl implements ReprodutorMusical {
    private String musicaAtual;
    private boolean tocando;
    
    public ReprodutorMusicalImpl() {
        this.musicaAtual = "";
        this.tocando = false;
    }
    
    @Override
    public void tocar() {
        if (musicaAtual.isEmpty()) {
            System.out.println("Nenhuma musica selecionada");
            return;
        }
        
        this.tocando = true;
        System.out.println("Reproduzindo: " + this.musicaAtual);
    }
    
    @Override
    public void pausar() {
        if (!tocando) {
            System.out.println("Reproducao ja esta pausada");
            return;
        }
        
        this.tocando = false;
        System.out.println("Musica pausada: " + this.musicaAtual);
    }
    
    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Musica selecionada: " + this.musicaAtual);
    }
}