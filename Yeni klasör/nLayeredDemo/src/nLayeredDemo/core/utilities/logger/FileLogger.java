package nLayeredDemo.core.utilities.logger;

public class FileLogger implements ILogger {

	@Override
	public void log(String message) {
		System.out.println("Logged to file"+message);
		
	}

}
