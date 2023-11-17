public class ATM {
    
    public void calis(Hesap hesap){
    
        LogIn login = new LogIn();
        
        Scanner scanner= new Scanner(System.in);
        System.out.println("bankanıza hoşgeldiniz!");
        System.out.println("*****************");
        System.out.println("kullanıcı girişi");
        System.out.println("*****************");
        int girisHakki=3;
        
        while (true) {            
            if(login.login(hesap)){
                System.out.println("başarıyla giriş yapıldı!");
            }
            else{
                System.out.println("giriş başarısız!");
                girisHakki-=1;
                System.out.println("kalan deneme hakkı: "+girisHakki);
            }
            if(girisHakki==0){
                System.out.println("!deneme hakkınız sonlanmıştır lütfen en yakın şubemize başvurunuz!");
                
                return;
            }
            System.out.println("**********************");
            String islemler= "1.bakiye görüntüle\n" +
                             "2.para yatırma\n" +
                             "3.para çekme\n" +
                             "4.çıkış için X'e basınız";
            System.out.println(islemler);
            System.out.println("**********************");
            
            while (true) {        
                System.out.println("yapmak istediğiniz işlemi seçiniz: ");
                String islem= scanner.nextLine();
                
                if(islem.equals("X")){
                    break;
                }
                else if(islem.equals("1")){
                    System.out.println("bakiyeniz:" +hesap.getBakiye());
                }
                else if(islem.equals("2")){
                    System.out.println("yatırmak istediğiniz tutar :");
                    int tutar= scanner.nextInt();
                    scanner.nextLine();
                    hesap.paraYatir(tutar);
                }
                else if(islem.equals("3")){
                    System.out.println("çekmek istediğiniz tutar :");
                    int tutar=scanner.nextInt();
                    scanner.nextInt();
                    hesap.paraCek(tutar);
                }
                else{
                    System.out.println("!geçersiz işlem!");
                }
                
                
            }
        }
