public class Main {

    public static void main(String[] args) {
	    int sayı=sayi(7,8);
	    System.out.println(sayı);
	    int toplam=topla(123,2,3,4);
	    System.out.println(toplam);
	    System.out.println(sayi(8,9));
    }
    public static int sayi(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static  int topla(int...sayilar){
        int toplam=0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}
