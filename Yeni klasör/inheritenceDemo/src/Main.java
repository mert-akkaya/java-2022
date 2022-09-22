public class Main {

    public static void main(String[] args) {
	    TarimKrediManager tarimKrediManager=new TarimKrediManager();
	    OgretmenKrediManager ogretmenKrediManager= new OgretmenKrediManager();
        KrediUI krediUI=new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());
    }
}
