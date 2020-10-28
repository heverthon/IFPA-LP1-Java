package atividade_cap4;
public class Conta {
    
    public int getNumero() {
        return numero;
    }

    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    public String getNome_titular() {
        return nome_titular;
    }

    
    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }

    
    public double getSaldo() {
        return saldo;
    }

    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
 private int numero;
 private String nome_titular;
 protected double saldo;
    public void depositar(double valor){
        this.saldo=this.getSaldo()+valor;
    }
    public boolean sacar(double valor){
        if(this.getSaldo()>= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public Conta(int numero, String nome_titular,double saldo){
        this.numero = numero;
        this.nome_titular = nome_titular;
        this.saldo = saldo;
    }
    public Conta(int numero, String nome_titular){
        this.numero = numero;
        this.nome_titular = nome_titular;
        this.saldo = 0;
    }
}
