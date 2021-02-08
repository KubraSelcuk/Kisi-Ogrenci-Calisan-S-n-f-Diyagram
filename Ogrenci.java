package JavaApp;

public class Ogrenci extends Kisi{
  private int ogrenciNo;
    private int mezuniyetKredisi;
  
   public int getMezuniyetkredisi(){
    return mezuniyetKredisi;
  }
  
  public void setMezuniyetkredisi(int mezuniyetKredisi){
    this.mezuniyetKredisi= mezuniyetKredisi;
  }
  
   public int getOgrenciNo(){
    return ogrenciNo;
  }
  
  public void setOgrenciNo(int ogrenciNo){
    this.ogrenciNo= ogrenciNo;
  }
  
   @Override
 public static void int toString(){
  return "Mezuniyet_Durumu("+" "ogrenciNo=" + mezuniyetKredisi+')';  
 }  

}