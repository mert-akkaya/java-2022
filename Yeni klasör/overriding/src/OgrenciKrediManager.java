public class OgrenciKrediManager extends BaseKrediManager {
    public double hesapla(double tutar){
        return tutar=tutar*1.10;
        // basekredimanagerdeki metod ile aynı ama class override ile aldığı mirası ezebilir eğer ezmemesini istiorsan
        // ezilmemesini istediğin methoda final keywordunu yaz
        //public final double hesapla() gibi
    }
}
