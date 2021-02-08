package JavaApp;

public class Calisan extends Kisi{
  
  private int sicilNo;
    private int derece;
  
   public int getDerece(){
    return derece;
  }
  
  public void setDerece(int derece){
    this.derece= derece;
  }
  
   public int getSicilno(){
    return sicilNo;
  }
  
  public void setSicilNo(int sicilNo){
    this.sicilNo= sicilNo;
  }
  
   @Override
 public int toInteger(){
  return "Maas_Hesapla("+" "sicilNo=" + derece+')';  
 }  


}