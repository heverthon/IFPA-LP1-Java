package atividade_cap4;
public class Contapoup extends Conta{
  public void reajustar(double percentual){
      saldo = saldo + saldo * percentual;
  }  
  public Contapoup(int numero, String nome_titular){
      super(numero,nome_titular);
  }
}
