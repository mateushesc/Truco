package Truco;

import java.util.ArrayList;
import java.util.List;

public class Cartas {

    private char[] tipo = {'4', '5', '6', '7', 'Q', 'J', 'K', 'A', '2', '3'}, naipe = {3, 4, 5, 6};

    private int valor;
    private char tipoCarta;
    private char naipeCarta;
    
    private static List<Cartas> baralho = new ArrayList<Cartas>();

    Cartas(char tipo, char naipe, int valor){
        this.tipoCarta = tipo;
        this.naipeCarta = naipe;
        this.valor = valor;
    }

    Cartas(){

    }

    void gerarCartas(){
        if (baralho.size() > 0){
            System.out.print("Baralho já criado\n");
            return;
        }
        for (int i = 0; i < tipo.length; i++) {
            for (int j = 0; j < naipe.length; j++) {
                baralho.add(new Cartas(tipo[i], naipe[j], i + 1));
            }
        }
        mostrarTodasCartas();
    }

    char getTipo(int index){
        return baralho.get(index).tipoCarta;
    }

    char getNaipe(int index){
        return baralho.get(index).naipeCarta;
    }

    int getValor(int index){
        return baralho.get(index).valor;
    }

    void mostrarTodasCartas(){
        for (int i = 0; i < baralho.size(); i++) {
            System.out.println(baralho.get(i).tipoCarta + " " + baralho.get(i).naipeCarta + " " + baralho.get(i).valor);
        }
    }
}
