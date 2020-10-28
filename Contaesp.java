package atividade_cap4;
public class Contaesp extends Conta{
    private double limite;
    public double getLimite(){
        return limite;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }
    public Contaesp(int numero,String nome_titular, double limite){
        super(numero, nome_titular);
        this.limite = limite;
    }
    @Override
    public boolean Sacar(double valor){
        if (valor <= this.limite + this.saldo){
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }
    }
}
