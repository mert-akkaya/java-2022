public class Main {

    public static void main(String[] args) {
        sayıBulmaca();

    }
    public static void sayıBulmaca(){
        int[] sayilar = {0,1,4,7,9};
        int aranacak =7;
        boolean varMi=false;

        for (int sayi:sayilar){
            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }
        String mesaj;
        mesaj="Sayı Vardır: "+aranacak;
        if (varMi){
            mesajVer(mesaj);
        }else {
           mesajVer("Sayı Yoktur: "+aranacak);
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);

    }
}
