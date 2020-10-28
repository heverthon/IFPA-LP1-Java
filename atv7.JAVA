//Questão 2

package testeconta;
import java.util.Scanner;
 
 public class TesteConta{

  public static void main(String[] args){
   Scanner teclado = new Scanner(System.in);
    String titular_conta;
    int opcao;
    double valor;

 System.out.println("Digitar o titular da conta: ");
 titular_conta = teclado.nextLine();

Conta c1 = new Conta(titular_conta);

do{
 
 System.out.println("");
 System.out.println("--- MENU ---");
 System.out.println(" 1) Dados Bancários ");
 System.out.println(" 2) Depósito ");
 System.out.println(" 3) Saque ");
 System.out.println(" 0) Sair ");

 System.out.println("Opção: ");
 opcao = teclado.nextInt();


if(opcao == 1){
 c1.DadosBancarios();

}
 else if(opcao == 2){
    System.out.println("Digitar o valor do depósito: ");
    valor = teclado.nextDouble();

  c1.Depositar(valor);
}
else if(opcao == 3){
 System.out.println("Digitar o valor do saque: ");
 valor = teclado.nextDouble();

c1.Sacar(valor);

}

else if(opcao != 0){
System.out.println("Opção Inválida");
}
System.out.println("");
  }
 
 }