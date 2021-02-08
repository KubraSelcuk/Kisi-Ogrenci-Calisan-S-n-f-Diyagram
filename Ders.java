package JavaApp;

public class Ders extends Ogrenci,Ogretim_Görevlisi{
 private String ad;
 private int kredi;
 
         public int getValue(){
    return kredi;
  }
  
  public void setKredi(int kredi){
    this.kredi= kredi;
  }
 
 
 
 public String getAd(){
    return ad;
  }
  
  public void setAd(String ad){
    this.ad= ad;
  }
}