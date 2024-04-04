package Truco;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Partida {

    private static int quantidadeCartas = 3, quantidadeJogadores = 4, quantidadeCartasEmUmaRodada = (quantidadeCartas * quantidadeJogadores + 1), counter;
    private static int[] cartasRodada = new int[quantidadeCartasEmUmaRodada];

    private static List<Partida> jogadores = new ArrayList<Partida>();

    Partida(){

    }
    
    void iniciarPartidaNormal(){
        counter = 1;
        for (int i = 0; i < 3; i++) {
            rodada();
        }
    }

    void rodada(){
        apagarCartasIndex();
        randomCartasIndex();
    }

    void apagarCartasIndex(){
        for (int i = 0; i < quantidadeCartasEmUmaRodada; i++) {
            cartasRodada[i] = -1;
        }
    }

    void randomCartasIndex(){
        Random random = new Random();
        System.out.println("Rodada " + counter++);
        for (int i = 0; i < quantidadeCartasEmUmaRodada; i++) {
            int randomNumber = random.nextInt(40);
            boolean out = true;
            while(out){
                for (int j = 0; j <= i; j++) {
                    if (cartasRodada[j] != randomNumber){
                        cartasRodada[i] = randomNumber;
                        out = false;
                    }
                }
            }
            System.out.println(cartasRodada[i]);
        }
    }
}
