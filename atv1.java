/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucao;
import java.util.Scanner;
/**
 *
 * @author 20162293794
 */
public class Resolucao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //QUESTÃO1
      /*    Scanner a = new Scanner(System.in);
        System.out.println("digite sua Idade.");
        int idade= a.nextInt();
        
        if (idade <16 ){
            System.out.println("Não vota!");
        }else
            if (idade==16 || idade==17 || idade>65){
              System.out.println("Voto Facultativo!");  
            }
        else
            System.out.println("Voto Obrigatório!");  
        */
      //QUESTÃO 2
     /* int numeroatual=1, numeroanterior=1, numeroproximo;
      System.out.println(numeroanterior);
      System.out.println(numeroatual);
      for (int i=0;i<30;i++){
          
          numeroproximo=numeroanterior+numeroatual;
          numeroanterior=numeroatual;
          numeroatual=numeroproximo;
          System.out.println(numeroproximo);
      }*/
     
   //QUESTÃO 3
     /*  
     float somanotas=0;
     float media=0;
     float notas[];
      int contadornotasmenores=0;
      int contadornotasmaiores=0;
     notas= new float[4];
     for (int i=0;i<notas.length;i++){
         Scanner a = new Scanner(System.in);
        System.out.println("digite a nota "+i);
        notas[i]= a.nextFloat();       
        
        somanotas=somanotas+notas[i];  
        
        media=somanotas/notas.length;
     }
     
     
     for (int i=0; i<notas.length;i++){
         if (notas[i]<media){
           
            contadornotasmenores++; //12
        }else
            contadornotasmaiores++; //12
                 
     }
         
        
      
      System.out.println("A média das notas é igual a "+media);
      System.out.println("existem o total de "+contadornotasmenores+" notas abaixo da média.");
      System.out.println("existem o total de "+contadornotasmaiores+" notas acima da média.");
      
     
    }*/
    //QUESTÃO 4
  /*  int numerodigitado=0;
    int contador=0;
    int somadosnumeros=0;
    float media=0;
    
    while (numerodigitado>=0){
        Scanner a = new Scanner(System.in);
        System.out.println("digite um numero >= 0");
        numerodigitado= a.nextInt(); 
       
        if (numerodigitado>0){
        somadosnumeros=somadosnumeros+numerodigitado;
        contador++;
        media=somadosnumeros/contador;
        }
    }
    System.out.println("A média dos numeros é igual a "+media);
    System.out.println("A quantidade dos numeros é igual a "+contador);
     
     */
    }
}    

