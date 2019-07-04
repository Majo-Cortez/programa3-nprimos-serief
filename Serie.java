public class Serie{
  public void imprimirSerie(){
  int var,a,b;
  a=0;
  b=1;
  var = 1;
  System.out.println(b);
  for(int i=0;i<20;i++){
     System.out.println(var);
     a=b;
     b=var;
     var= a+b;
  }
 }
}