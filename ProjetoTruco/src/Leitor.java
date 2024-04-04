package Truco;

import java.util.Scanner;

public class Leitor {

    Leitor(){
    }

    String leitor(){
        Scanner leitor = new Scanner(System.in);
        String input = leitor.nextLine();
        return input;
    }
}
