import java.util.Scanner;

/**
 * Classe principal interativa para demonstrar a utilizacao do iPhone
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static iPhone iphone = new iPhone();
    private static boolean ligado = false;
    private static String musicaAtual = "";
    
    public static void main(String[] args) {
        System.out.println("=== SIMULADOR DE iPHONE ===");
        
        boolean sair = false;
        while (!sair) {
            exibirMenuPrincipal();
            int opcao = lerOpcao(0, 4);
            
            switch (opcao) {
                case 1:
                    menuIPhone();
                    break;
                case 2:
                    if (verificarLigado()) {
                        menuReprodutorMusical();
                    }
                    break;
                case 3:
                    if (verificarLigado()) {
                        menuAparelhoTelefonico();
                    }
                    break;
                case 4:
                    if (verificarLigado()) {
                        menuNavegadorInternet();
                    }
                    break;
                case 0:
                    System.out.println("Encerrando simulador. Ate logo!");
                    sair = true;
                    break;
            }
        }
        
        scanner.close();
    }
    
    /**
     * Exibe o menu principal
     */
    private static void exibirMenuPrincipal() {
        System.out.println("\n=== MENU PRINCIPAL ===");
        System.out.println("Status do iPhone: " + (ligado ? "LIGADO" : "DESLIGADO"));
        System.out.println("1. Controles do iPhone (Ligar/Desligar/Reiniciar)");
        System.out.println("2. Reprodutor Musical");
        System.out.println("3. Aparelho Telefonico");
        System.out.println("4. Navegador de Internet");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opcao: ");
    }
    
    /**
     * Menu de controle do iPhone
     */
    private static void menuIPhone() {
        boolean voltar = false;
        
        while (!voltar) {
            System.out.println("\n=== CONTROLES DO iPHONE ===");
            System.out.println("1. Ligar");
            System.out.println("2. Desligar");
            System.out.println("3. Reiniciar");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opcao: ");
            
            int opcao = lerOpcao(0, 3);
            
            switch (opcao) {
                case 1:
                    if (!ligado) {
                        iphone.ligar();
                        ligado = true;
                    } else {
                        System.out.println("O iPhone ja esta ligado.");
                    }
                    break;
                case 2:
                    if (ligado) {
                        iphone.desligar();
                        ligado = false;
                    } else {
                        System.out.println("O iPhone ja esta desligado.");
                    }
                    break;
                case 3:
                    if (ligado) {
                        iphone.reiniciar();
                        System.out.println("iPhone reiniciado com sucesso.");
                    } else {
                        System.out.println("O iPhone esta desligado. Ligue-o primeiro.");
                    }
                    break;
                case 0:
                    voltar = true;
                    break;
            }
        }
    }
    
    /**
     * Menu do reprodutor musical
     */
    private static void menuReprodutorMusical() {
        ReprodutorMusical reprodutor = iphone.getReprodutorMusical();
        boolean voltar = false;
        boolean tocando = false;
        
        while (!voltar) {
            System.out.println("\n=== REPRODUTOR MUSICAL ===");
            
            // Mostrar status
            if (!musicaAtual.isEmpty()) {
                System.out.println("Musica selecionada: " + musicaAtual);
                System.out.println("Status: " + (tocando ? "Reproduzindo" : "Pausada"));
            } else {
                System.out.println("Nenhuma musica selecionada");
            }
            
            System.out.println("\n1. Tocar musica");
            System.out.println("2. Pausar musica");
            System.out.println("3. Selecionar musica");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opcao: ");
            
            int opcao = lerOpcao(0, 3);
            
            switch (opcao) {
                case 1:
                    if (musicaAtual.isEmpty()) {
                        System.out.println("Nenhuma musica selecionada. Selecione uma musica primeiro.");
                    } else {
                        reprodutor.tocar();
                        tocando = true;
                    }
                    break;
                case 2:
                    if (!tocando) {
                        System.out.println("Nenhuma musica esta sendo reproduzida.");
                    } else {
                        reprodutor.pausar();
                        tocando = false;
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome da musica: ");
                    musicaAtual = scanner.nextLine();
                    reprodutor.selecionarMusica(musicaAtual);
                    tocando = false;
                    break;
                case 0:
                    voltar = true;
                    break;
            }
        }
    }
    
    /**
     * Menu do aparelho telefonico
     */
    private static void menuAparelhoTelefonico() {
        AparelhoTelefonico telefone = iphone.getAparelhoTelefonico();
        boolean voltar = false;
        
        while (!voltar) {
            System.out.println("\n=== APARELHO TELEFONICO ===");
            System.out.println("1. Fazer ligacao");
            System.out.println("2. Atender chamada");
            System.out.println("3. Iniciar correio de voz");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opcao: ");
            
            int opcao = lerOpcao(0, 3);
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o numero para ligar: ");
                    String numero = scanner.nextLine();
                    telefone.ligar(numero);
                    break;
                case 2:
                    telefone.atender();
                    break;
                case 3:
                    telefone.iniciarCorreioVoz();
                    break;
                case 0:
                    voltar = true;
                    break;
            }
        }
    }
    
    /**
     * Menu do navegador de internet
     */
    private static void menuNavegadorInternet() {
        NavegadorInternet navegador = iphone.getNavegadorInternet();
        boolean voltar = false;
        
        while (!voltar) {
            System.out.println("\n=== NAVEGADOR DE INTERNET ===");
            System.out.println("1. Exibir pagina");
            System.out.println("2. Adicionar nova aba");
            System.out.println("3. Atualizar pagina");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opcao: ");
            
            int opcao = lerOpcao(0, 3);
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite a URL da pagina: ");
                    String url = scanner.nextLine();
                    navegador.exibirPagina(url);
                    break;
                case 2:
                    navegador.adicionarNovaAba();
                    break;
                case 3:
                    navegador.atualizarPagina();
                    break;
                case 0:
                    voltar = true;
                    break;
            }
        }
    }
    
    /**
     * Verifica se o iPhone esta ligado
     * @return true se ligado, false caso contrario
     */
    private static boolean verificarLigado() {
        if (!ligado) {
            System.out.println("O iPhone esta desligado. Por favor, ligue-o primeiro.");
            return false;
        }
        return true;
    }
    
    /**
     * Le uma opcao do usuario dentro de um intervalo valido
     * @param min O valor minimo valido
     * @param max O valor maximo valido
     * @return A opcao escolhida pelo usuario
     */
    private static int lerOpcao(int min, int max) {
        int opcao = -1;
        boolean entradaValida = false;
        
        while (!entradaValida) {
            try {
                String entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada);
                
                if (opcao >= min && opcao <= max) {
                    entradaValida = true;
                } else {
                    System.out.print("Opcao invalida. Digite um numero entre " + min + " e " + max + ": ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Por favor, digite um numero valido: ");
            }
        }
        
        return opcao;
    }
}