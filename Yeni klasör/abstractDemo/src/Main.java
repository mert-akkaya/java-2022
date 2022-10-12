public class Main {

    public static void main(String[] args) {
	    CostumerManager costumerManager = new CostumerManager();
	    costumerManager.databaseManager = new OracleDatabaseManager();
	    costumerManager.getCostumer();
    }
}
