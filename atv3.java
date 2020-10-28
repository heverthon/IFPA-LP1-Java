
package questão2;

public class Questão2 {

    public static void main(String[] args) {
    //1,1,2,3,5,8,13,21...
    int sf,a,b;
    a=0;
    b=1;
    sf=1;
        System.out.println(a);
    System.out.println("-> " +b);
        for(int i=0;i<30;i++){
            System.out.println("-> " +sf);
            a=b;
            b=sf;
            sf=a+b;
        }
    }
    
}
