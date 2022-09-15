public class Main {

    public static void main(String[] args) {
	    int[] sayilar = {0,1,4,7,9};
	    int aranacak =7;
	    boolean varMi=false;

	    for (int sayi:sayilar){
	        if (sayi==aranacak){
	            varMi=true;
	            break;
            }
        }
	    if (varMi){
	        System.out.println("Sayı Vardır");
        }else {
	        System.out.println("Sayı Yoktur");
        }
    }
}
