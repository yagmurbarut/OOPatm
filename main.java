public class main {
    public static void main(String[] args) {
        ATM atm= new ATM();
        Hesap hesap= new Hesap("yamur", "1234", 10000);
        atm.calis(hesap);
        System.out.println("programdan çıkılıyor lütfen sayfadan ayrılmayınız...");
    }
}
