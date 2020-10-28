
package questão1;
import java.util.Scanner;
public class Questão1 {

    public static void main(String[] args) {
    Scanner t=new Scanner(System.in);
    byte idade;
        System.out.println("Digite sua idade: ");
        idade = t.nextByte();
        if(idade >= 65 ||idade == 16 ||idade == 17){
            System.out.println("Votar é facultativo");
            }        
        else if (idade <=16){
            System.out.println("Você não pode votar");
        }
        else{
            System.out.println("Votar é obrigatório");
        }
    
    }
    
    
}
