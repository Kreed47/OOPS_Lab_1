final class Logger{
    public void logMessage(String message){
        System.out.println("Log : Lost at Sea : "+ message);
    }
}
/*
class Extended extends Logger
 */
public class Main2 {
    public static void main(String[] args){
        Logger logger = new Logger();
        logger.logMessage(" Send help SOS!!");
    }
}