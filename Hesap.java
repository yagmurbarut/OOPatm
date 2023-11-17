public class Hesap {

    private String kullaniciAdi;
    private String parola;
    private int bakiye;
    

    public Hesap( String kullaniciAdi, String parola, int bakiye){
        this.kullaniciAdi= kullaniciAdi;
        this.parola= parola;
        this.bakiye= bakiye;
        
    }
    
    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
     
    public void setParola(String parola){
        this.parola= parola;
    }
    public void setBakiye(int bakiye){
        this.bakiye=bakiye;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }
    public String getParola (){
        return parola;
    }
    public int getBakiye(){
        return bakiye;
    }
    
    public void paraYatir(int tutar){
        this.bakiye+=tutar;
        System.out.println("yeni bakiyeniz: "+bakiye);
    }
    public void paraCek(int tutar){
        if(bakiye-tutar< 0){
            System.out.println("yeterli bakiye yok!");
        }
        else{
            this.bakiye-=tutar;
            System.out.println("kalan bakiye: " +bakiye);
        }
    }
    }
