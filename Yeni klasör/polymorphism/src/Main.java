public class Main {

    public static void main(String[] args) {
//        BaseLogger[] loggers = new  BaseLogger[]{new FileLogger(),new DatabaseLogger(),new EmailLogger()};
//        for (BaseLogger logger:loggers){
//            logger.log("Log mesajı");
//        }
        CostumerManager costumerManager = new CostumerManager(new DatabaseLogger());
        costumerManager.add();
    }
}
