package nLayeredDemo.core.utilities.logger;

public class SmsLogger implements ILogger {
	
	@Override
	public void log(String message) {
		System.out.println("Logged to sms" +message);
		
	}
}
