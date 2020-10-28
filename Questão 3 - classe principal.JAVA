// Questão 3 - classe principal

package contasmultiplas;
import java.util.Scanner;
import java.util.ArrayList; 

 public class ContasMultiplas{

  public static void main(String[] args){
   Scanner teclado = new Scanner(System.in);
    String titular_conta;
    int opcao, numero;
    double valor;
    ArrayList<Conta> listaconta =new ArrayList(); 
     
 System.out.println("Digitar o titular da conta: ");
 titular_conta = teclado.nextLine();

Conta c1; 

do{
 
 System.out.println("");
 System.out.println("--- MENU ---");
 System.out.println(" 1) Dados Bancários ");
 System.out.println(" 2) Depósito ");
 System.out.println(" 3) Saque ");
 System.out.println(" 0) Sair ");

 System.out.println("Opção: ");
 opcao = teclado.nextInt();
 teclado.nextLine();

switch(opcao){
case 1:
System.out.println("Digite o nome do titular: ");
titular_conta = teclado.nextLine();
c1=new Conta(titular_conta);
listaconta.add(c1);

 break;
case 2:
 System.out.println("Digite o número da conta: ");
 numero = teclado.nextInt();
 
c1 = teclado.get(numero-1);
c1.DadosBancarios();

 break;
case 3:
System.out.println("Digite o número da conta: ");
 numero = teclado.nextInt();
 
c1 = teclado.get(numero-1);

  System.out.println("Digitar o valor do depósito: ");
    valor = teclado.nextDouble();

  c1.Depositar(valor);

 break;
case 4:
System.out.println("Digite o número da conta: ");
 numero = teclado.nextInt();
 
c1 = teclado.get(numero-1);

  System.out.println("Digitar o valor do saque: ");
    valor = teclado.nextDouble();

  c1.Sacar(valor);

 break;

  defaut:
if (opcao != 0){
System.out.println("Opção Inválida");
break;

}

System.out.println("");

}
while(opcao != 0){
  }
 
 }