// não consegui terminar por causa do tempo
package questão4;

import java.util.Scanner;

public class Questão4 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int num, s = 0, media;
        String resp = null;
        do {
            System.out.println("Digite um número maior ou igual a zero: ");
            num = t.nextInt();
            s = s + num;
        } while (resp.equals("s"));
        System.out.println("A soma de todos os valores é " + s);
        s = t.nextInt();

    }
    if(num < 0){
            System.out.println("Eu disse maior ou igual!");

    }
}

