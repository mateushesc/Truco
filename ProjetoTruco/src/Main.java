package Truco;

public class Main {
    public static void main(String[] args) {
        Leitor requestRead = new Leitor();
        Cartas requestCartas = new Cartas();
        Partida requestPartida = new Partida();
        int opção;
        do {    
            System.out.print("============================ Menu Inicial ==================================\n");
            System.out.print("[1] Para iniciar partida\n[2] Mostrar configurações atuais \n[3] Configurar partida\n[0] Para fechar programa\n");
            decoração();
            opção = Integer.parseInt(requestRead.leitor());
            System.out.print("\033[H\033[2J");
            switch (opção) {
                case 1:
                    requestCartas.gerarCartas();
                    requestPartida.iniciarPartidaNormal();
                    break;
                case 2:
                    System.out.print("Em obras\n");
                    break;
                case 3:
                    System.out.print("Em obras\n");
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }while (true);
    }
    static void decoração(){
        System.out.print("============================================================================\n");
    }
}


/*
Truco:
Criar menu inicial [x]
Clear no console [x]
Criar cartas [x]
Criar valores [x]
Criar vira e alterar valores das manilhas [ ]
Distribuir cartas aleatóriamente [ ]
Mostrar status atual [ ]
Criar rodadas [ ]
Criar vitória [ ]
Gerar truco 6 9 12 e desistência[ ]
Descartar cartas [ ]



Extra:
Modo ajuda iniciantes [ ]
Modo tryhard (senha) []
Modo cegas [ ]
Partida customizada [ ]
 */