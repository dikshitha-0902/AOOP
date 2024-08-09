package week1;

public class Logger {
	 private static Logger loggerInstance;

	    private Logger() {
	        // Private to prevent instantiation
	    }
	    public static synchronized Logger getInstance() {
	        if (loggerInstance == null) {
	            loggerInstance = new Logger();
	        }
	        return loggerInstance;
	    }
	    public void log(String message) {
	        System.out.println("Log message: " + message);
	    }
}
