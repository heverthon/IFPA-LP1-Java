// Quest�o 3 classe conta

package teste;
 public class Conta{
  private int numero;
  private String titular;
  private double saldo;
  static int qtdcontas = 0;
   
   public Conta(String xtitular){
   this.titular = xtitular
    qtdcontas++;
     this.numero = qtdcontas;
     this.saldo = 0;
   
   }
   
   public void DadosBancarios(){
     System.out.println(""); 
     System.out.println("-- Dados Banc�rios --");
     System.out.println("- N�mero: " +this.numero);
     System.out.println("- Titular: "+this.titular);
     System.out.println("- saldo: "  +this.saldo);
     System.out.println("--- Fim Dados Banc�rios ---");
     System.out.println("");
   }
   
   public void Depositar(double xValor){ //met�do Depositar
   this.saldo += xValor;  //this.saldo = this.saldo + xValor
   System.out.println("");
   System.out.println("--- Realizando Dep�sito ---");
   System.out.println("- Saldo Anterior : +this.saldo");
}
   public void Sacar (double xValor){  //met�do Sacar
    System.out.println("");
    System.out.println("--- Realizando Saque ---");
    System.out.println("Saldo anterior "+ this.saldo);

  if (xValor <= this.saldo){ //CASO EU TENHA SALDO
   this.saldo -= xValor; //this.saldo = this.saldo - xValor;
   
   System.out.println("- Saldo posterior: "+this.saldo);

}
  else{ //CASO EU N�O TENHA SALDO
   System.out.println("- Saldo Insuficiente");
}

System.out.println("--- Fim do Saque ---");
System.out.println("");

}
}