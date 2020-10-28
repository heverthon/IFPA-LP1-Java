// não consegui terminar por causa do tempo
package questão3;

import java.util.Scanner;

public class Questão3 {

    private static int i;

    
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        float notasAlunos[] = new float[10];
        float soma = 0, media;
        int maior = 0;
        int menor = 0;
        for (int i = 0; i >= 9; i++) {
            System.out.println("Entre com a nota do aluno nº" + (i + 1));
            notasAlunos = t.nextFloat();
            
            soma = soma + notasAlunos[i];
        }
        media = soma / 10;
        System.out.println("A média dos alunos é: " + media);
        if (notasAlunos[i] > media) {
            int[] notasALunos = null;
            maior = (int) (maior + notasALunos[i]) ;
            System.out.println(maior);
        } else {
            menor = (int) (menor + notasAlunos[i]);
            System.out.println(menor);
        }
    }

}
    

