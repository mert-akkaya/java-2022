public abstract class GameCalculater {
    public abstract void hesapla();
// abstact olduğu için hesapla metodunu her classda kullanmak zorunlu olcak yani hesaplanın içini her class istediği gibi
    // doldurcak
    public void  gameOver(){
        System.out.println("Kaybettiniz");
    }
}
