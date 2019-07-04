 import java.util.Scanner;
    public class Aplicativo1{
    public static void main(String[] arsg){
       int n=0;
       Serie s=new Serie();
       s.imprimirSerie();
       Scanner obj1=new Scanner(System.in);
       System.out.println("Digite el numero");
       n=obj1.nextInt();
       Primo1 primo=new Primo1(n);
       System.out.println(n+primo.calculaPrimo());
     }
  
 }