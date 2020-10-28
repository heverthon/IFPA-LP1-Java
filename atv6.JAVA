// Questão 1

package teste;
 public class Conta{
  private int numero;
  private String titular;
  private double saldo;
   public void Depositar(double xValor){
   this.saldo += xValor;  //this.saldo = this.saldo + xValor
   System.out.println("");
   System.out.println("--- Realizando Depósito ---");
   System.out.println("- Saldo Anterior : +this.saldo");
}
   public void Sacar (double xValor){  
    System.out.println("");
    System.out.println("--- Realizando Saque ---");
    System.out.println("Saldo anterior "+ this.saldo);

  if (xValor <= this.saldo){ //CASO EU TENHA SALDO
   this.saldo -= xValor; //this.saldo = this.saldo - xValor;
   
   System.out.println("- Saldo posterior: "+this.saldo);

}
  else{ //CASO EU NÃO TENHA SALDO
   System.out.println("- Saldo Insuficiente");
}

System.out.println("--- Fim do Saque ---");
System.out.println("");

}
}