package JavaApp;

public class Kisi{
  private String ad;
  
   private String soyisim;
   
      private String cinsiyet;
      private int tcNo;
      private String telNo ;
      private String email ;
           
           
           
           
        public String getEmail(){
    return email;
  }
  
  public void setEmail(String email){
    this.email= email;
  }
           
           
           
           
       public String getTel(){
    return telNo;
  }
  
  public void setCinsiyet(String telNo){
    this.telNo= telNo;
  }
          public int getValue(){
    return tcNo;
  }
  
  public void setTcno(int tcNo){
    this.tcNo= tcNo;
  }
  
  
   
     public String getCinsiyet(){
    return cinsiyet;
  }
  
  public void setCinsiyet(String cinsiyet){
    this.cinsiyet= cinsiyet;
  }
   
     public String getSoyisim(){
    return soyisim;
  }
  
  public void setSoyisim(String soyisim){
    this.soyisim= soyisim;
  }

  public String getAd(){
    return ad;
  }
  
  public void setAd(String ad){
    this.ad= ad;
  }
  
  
 @Override
 public String toString(){
  return "Kisi("+" "ad=" + soyisim+",cinsiyet="+cinsiyet+",telNo="+telNo+",email="+email+')';  
 }  
}