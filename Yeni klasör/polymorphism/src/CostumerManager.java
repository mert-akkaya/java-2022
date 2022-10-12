public class CostumerManager extends BaseLogger {
    private BaseLogger logger;

    public CostumerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void add(){
        System.out.println("eklendi");
        this.logger.log("log mesajı");
    }
}
