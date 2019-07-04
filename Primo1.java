   public class Primo1{
     private int nprimo;
   public Primo1(int nprimo){
     this.nprimo=nprimo;
 }
   public void setNprimo(int nprimo){
      nprimo=nprimo;
	}
   public float getNprimo(){
      return nprimo;
	}
   public String calculaPrimo(){
      int cont2=0;
      for(int cont1=1; cont1<=nprimo; cont1++){
          if((nprimo % cont1)==0){
              cont2++;
             }
        }
          if(cont2==2)
             return("Es primo");
          else
             return("No es primo");
   }

}