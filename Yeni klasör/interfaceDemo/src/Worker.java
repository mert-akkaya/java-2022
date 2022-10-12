public class Worker implements IWorkable,IEatable,IPayable {
    @Override
    public void eat() {
        System.out.println("yemek verildi");
    }

    @Override
    public void pay() {
        System.out.println("Para verildi");
    }

    @Override
    public void work() {
        System.out.println("Çalıştırıldı");
    }
}
